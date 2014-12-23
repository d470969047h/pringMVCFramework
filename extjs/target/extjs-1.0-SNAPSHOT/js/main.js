/**
 * Created by daihui on 2014/10/26.
 */
/**
 * Created by Administrator on 2014/10/24.
 */
Ext.define('ShiNowMain', {
    extend: 'Ext.container.Viewport',
    initComponent: function () {
        var me = this;
        this.createMenuList();
        Ext.apply(this, {
            layout: 'border',
            items: [
                {
                    region: 'north',
                    xtype: 'toolbar',
                    border: false,
                    height: 40,
                    style: {
                        backgroundColor: '#157fcc'
                    },
                    items: [
                        {
                            xtype: 'tbtext',
                            text: '假淘宝',
                            style: {
                                color: 'yellow',
                                margin: '15 0 0 15',
                                fontSize: '20pt'
                            }
                        },
                        '->',       //等于 { xtype: 'tbfill' },
                        {
                            xtype: 'button',
                            text: '注销'
                        }
                    ]
                },
                {
                    region: 'south',
                    split: true,
                    height: 100,
                    minSize: 100,
                    maxSize: 200,
                    collapsible: true,
                    collapsed: true,
                    title: '友情链接',
                    margins: '0 0 0 0'
                },
                {
                    region: 'west',
                    id: 'westPanel',
                    title: '菜单栏',
                    split: true,
                    width: 200,
                    minWidth: 175,
                    maxWidth: 400,
                    margins: '0 0 0 5',
                    layout: 'accordion',
                    items: me.menuList

                },
                {
                    title: '个人中心',
                    region: 'east',
                    xtype: 'panel',
                    margins: '5 0 0 5',
                    width: 200,
                    split: true,
                    collapsible: true,
                    animCollapse: true,
                    id: 'west-region-container',
                    layout: 'accordion',
                    items: [
                        {
                            title: '购物车'
                        },
                        {
                            title: '我的淘宝'
                        },
                        {
                            title: '收藏夹'
                        }
                    ]
                },

                 {
                    region: 'center',
                     id:'tabCenter',
                     xtype:'tabpanel',
                    deferredRender: false,
                    activeTab: 0

                }
            ]
        });
        this.callParent();
    },


    menuList: new Array(),
    createMenuList: function () {
        var menuData = {}, tpl, me = this;
        tpl = new Ext.XTemplate(
            '<tpl for=".">',
            '<div class="part01">',
            '<img src="{src}">',
            '<div class="con">',
            '<span>{name}</span>',
            '<div class="con1">{remark}</div>',
            '</div>',
            '</div>',
            '</tpl>'
        );

        Ext.Ajax.request({
            url: '/main',
            async: false,
            success: function (response) {
                menuData = Ext.JSON.decode(response.responseText);
            }
        });

        for (var i = 0, len = menuData.titleList.length; i < len; i++) {
            var storeID = 'store_' + i, item, title = menuData.titleList[i].title;
            Ext.create('Ext.data.Store', {
                id: storeID,
                data: menuData.titleList[i].childrenByTitleId,
                fields: [
                    { name: 'childId', type: 'String' },
                    { name: 'name', type: 'String' },
                    { name: 'remark', type: 'String' },
                    { name: 'src', type: 'String' },
                    { name: 'tag', type: 'String' },
                    { name: 'model', type: 'String' }
                ]
            });

            item = {
                xtype: 'panel',
                title: title,
                layout: 'fit',
                items: [{
                    xtype: 'dataview',
                    store: Ext.data.StoreManager.lookup(storeID),
                    tpl: tpl,
                    itemSelector: 'div.part01',
                    //监听view的click事件
                    listeners:{
                    itemclick:function(view,record){
                        Ext.require(record.get('model'),function(){
                            var obj=Ext.create(record.get('model'));
                            var center=Ext.getCmp('tabCenter');
                            var tab=center.items.get(record.get('tag'));
                            if(!tab){
                                center.add(obj);
                                center.setActiveTab(obj);
                            }
                            else{
                                if(center.setActiveTab()!==tab){
                                    center.setActiveTab(tab);
                                }
                            }
                        },this);

                    }
                    }
                }]
            };

            me.menuList.push(item);
        }
    }
});
