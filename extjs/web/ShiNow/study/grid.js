Ext.define('ShiNow.study.grid', {
    extend: 'Ext.grid.Panel',
    requires: [
        'Ext.ux.grid.filter.StringFilter',
        'Ext.ux.grid.filter.NumericFilter',
        'Ext.ux.grid.FiltersFeature'
    ],
    itemsPerPage: 5,//全局
    initComponent: function () {
        var me = this;
        var store = Ext.create('Ext.data.Store', {
            autoLoad: false,
            fields: ['cityId', 'cityName'],
            pageSize: me.itemsPerPage,
            proxy: {
                type: 'ajax',
                url: '/queryCity',
                reader: {
                    type: 'json',
                    root: 'cityList',
                    totalProperty: 'rowCount'
                }
            },
            //查询时分页监听
            listeners: {
                beforeload: function (store, operation) {
                    var cityBH = Ext.getCmp('cityId');                          //获取输入框（城市编号）
                    var name = Ext.getCmp('city');                              //获取输入框（城市名称）
                    if (name || cityBH) {
                        if (name.getValue() || cityBH.getValue()) {
                            if (operation.params) {                             //获取查询条件
                                operation.params.cityIdName = cityBH.getValue();
                                operation.params.param = name.getValue();
                            }
                            else {
                                operation.params = {cityIdName: cityBH.getValue()}
                                operation.params = {param: name.getValue()}
                            }
                        }
                    }
                }
            }

        });

        //过滤器
        var myFilter = {
            menuFilterText: '过滤字段',
            ftype: 'filters',
            autoReload: true,
            encode: false,
            local: true,
            filters: [
                {
                    type: 'string',
                    dataIndex: 'cityName'
                },
                {
                    type: 'numeric',
                    dataIndex: 'cityId'
                }
            ]
        };

        store.load({
            params: {
                start: 0,
                limit: me.itemsPerPage
            }
        });

        Ext.apply(this, {
            title: '城市',
            closable: true,
            features: [myFilter],
            loadMask: true,//数据加载时有一个蒙版，防止用户误点
            id: 'grid',
            width: 400,
            store: store,
            columns: [
                {text: '城市编号', dataIndex: 'cityId'},
                {text: '城市名称', dataIndex: 'cityName'}
            ],
            dockedItems: [
                {
                    xtype: 'pagingtoolbar',
                    store: store,
                    dock: 'bottom',
                    displayInfo: true
                }
            ],
            tbar: [
                {
                    xtype: 'button',
                    text: '添加',
                    handler: function () {
                        me.AddWindow(me)
                    }
                },
                {
                    xtype: 'button',
                    text: '删除',
                    handler: function () {
                        me.deleteWindow(me)
                    }
                },
                {
                    xtype: 'button',
                    text: '修改',
                    handler: function () {
                        me.updateWindow(me)
                    }
                },
                {
                    xtype: 'textfield',
                    fieldLabel: '城市编号',
                    labelAlign: 'right',
                    name: 'cityIdName',
                    id: 'cityId',
                    allowBlank: true
                },
                {
                    xtype: 'textfield',
                    fieldLabel: '城市名称',
                    labelAlign: 'right',
                    name: 'param',
                    id: 'city',
                    allowBlank: true
                },
                {
                    xtype: 'button',
                    text: '查询',
                    handler: me.queryData
                }

            ]
        });
        this.callParent();
    },

    //添加数据window
    AddWindow: function (add) {
        var window = Ext.create('Ext.window.Window', {

            title: '添加数据',
            id: 'window',
            modal: true,        //添加一个蒙版
            items: [
                {
                    xtype: 'form',
                    border: false,
                    id: 'addForm',
                    frame: true,
                    bodyPadding: '5 5 0',
                    width: 390,
                    fieldDefaults: {
                        msgTarget: 'side',
                        labelAlign: 'right',
                        labelWidth: 75
                    },
                    defaultType: 'textfield',
                    items: [
                        {
                            fieldLabel: '城市名称',
                            name: 'cityInfo.cityName',
                            allowBlank: false,
                            tooltip: '输入城市名称'
                        }
                    ]
                }
            ],
            buttonAlign: 'center',
            buttons: [
                {
                    text: '确定',
                    handler: add.addData
                },
                {
                    text: '取消',
                    handler: function () {
                        this.up('window').close();
                    }
                },
                {
                    text: '清空',
                    handler: function () {
                        Ext.getCmp('addForm').getForm().reset();
                    }
                }
            ]

        });
        window.show();
        window.center();

    },
    //添加数据
    addData: function () {
        var form = this.up('window').down('form').getForm();
        if (form.isValid()) {
            form.submit({
                url: '/addCity',
                success: function (form, action) {
                    var msg = Ext.JSON.decode(action.response.responseText);
                    Ext.Msg.alert('成功！', msg.message);
                    // window.location='layOut.jsp'
                    Ext.getCmp('grid').store.reload();
                    Ext.getCmp('window').close();

                },
                failure: function (form, action) {
                    var msg = Ext.JSON.decode(action.response.responseText);
                    Ext.Msg.alert('失败！', msg.message);
                }
            });
        }
    },

    //修改数据
    updateWindow: function (update) {
        var record=Ext.getCmp('grid').getSelectionModel().getLastSelected();
       // var record = Ext.getCmp('grid').getSelectionModel().getSelection()[0];
        var window = Ext.create('Ext.window.Window', {
            title: '修改数据',
            id: 'window',
            modal: true,        //添加一个蒙版
            items: [
                {
                    xtype: 'form',
                    border: false,
                    id: 'updateForm',
                    frame: true,
                    bodyPadding: '5 5 0',
                    width: 390,
                    fieldDefaults: {
                        msgTarget: 'side',
                        labelAlign: 'right',
                        labelWidth: 75
                    },
                    defaultType: 'textfield',
                    items: [
                        {
                            fieldLabel: '城市编号',
                            name: 'cityInfo.cityId',
                            value: record.get('cityId'),
                            allowBlank: false,
                            readOnly: true
                        },
                        {
                            fieldLabel: '城市名称',
                            name: 'cityInfo.cityName',
                            value: record.get('cityName'),
                            allowBlank: false,
                            tooltip: '修改城市名称'
                        }
                    ]
                }
            ],
            buttonAlign: 'center',
            buttons: [
                {
                    text: '确定',
                    handler: update.updateData
                },
                {
                    text: '取消',
                    handler: function () {
                        this.up('window').close();
                    }
                }

            ]

        });
        window.show();
        window.center();

    },
    //修改数据
    updateData: function () {
        var form = this.up('window').down('form').getForm();
        if (form.isValid()) {
            form.submit({
                url: '/updateCity',
                success: function (form, action) {
                    var msg = Ext.JSON.decode(action.response.responseText);
                    Ext.Msg.alert('成功！', msg.message);
                    Ext.getCmp('grid').store.reload();
                    Ext.getCmp('window').close();

                },
                failure: function (form, action) {
                    var msg = Ext.JSON.decode(action.response.responseText);
                    Ext.Msg.alert('失败！', msg.message);
                }
            });
        }
    },

    //删除数据
    deleteWindow: function (delete1) {
        var record = Ext.getCmp('grid').getSelectionModel().getLastSelected();
       // var record = Ext.getCmp('grid').getSelectionModel().getSelection()[0];
        var window = Ext.create('Ext.window.Window', {
            title: '确定删除该条记录吗？',
            id: 'window',
            modal: true,        //添加一个蒙版
            items: [
                {
                    xtype: 'form',
                    border: false,
                    id: 'deleteForm',
                    frame: true,
                    bodyPadding: '5 5 0',
                    width: 390,
                    fieldDefaults: {
                        msgTarget: 'side',
                        labelAlign: 'right',
                        labelWidth: 75
                    },
                    defaultType: 'textfield',
                    items: [
                        {
                            fieldLabel: '城市编号',
                            name: 'cityInfo.cityId',
                            value: record.get('cityId'),
                            allowBlank: false,
                            readOnly: true,
                            tooltip: '修改城市编号'
                        },
                        {
                            fieldLabel: '城市名称',
                            name: 'cityInfo.cityName',
                            value: record.get('cityName'),
                            allowBlank: false,
                            readOnly: true,
                            tooltip: '修改城市名称'
                        }
                    ]
                }
            ],
            buttonAlign: 'center',
            buttons: [
                {
                    text: '确定',
                    handler: delete1.deleteData
                },
                {
                    text: '取消',
                    handler: function () {
                        this.up('window').close();
                    }
                }

            ]

        });
        window.show();
        window.center();

    },
    //删除数据
    deleteData: function () {
        var form = this.up('window').down('form').getForm();
        if (form.isValid()) {
            form.submit({
                url: '/deleteCity',
                success: function (form, action) {
                    var Pages = Ext.getCmp('grid').store.currentPage;
                    var msg = Ext.JSON.decode(action.response.responseText);
                    Ext.Msg.alert('成功！',msg.message);
                    var count=Ext.getCmp('grid').getStore().getCount();
                    if(count>=1){
                        Ext.getCmp('grid').store.reload();
                        Ext.getCmp('window').close();
                    }
                    Ext.getCmp('grid').store.loadPage(Pages);
                    Ext.getCmp('grid').store.reload();
                    Ext.getCmp('window').close();
                },
                failure: function (form, action) {
                    var msg = Ext.JSON.decode(action.response.responseText);
                    Ext.Msg.alert('失败！', msg.message);
                }
            });
        }
    },

    //查询数据
    queryData: function () {
        Ext.getCmp('grid').store.load({
            params: {
                param: Ext.getCmp('city').getValue(),
                cityIdName: Ext.getCmp('cityId').getValue()
            }
        });
    }

});
