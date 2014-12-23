Ext.onReady(function(){
    var itemsPerPage = 3;
    var store=Ext.create('Ext.data.Store',{
        fields:['cityId','cityName'],
        autoLoad:false,
        pageSize:itemsPerPage,
        proxy:{
            type:'ajax',
            url:'/gird',
            reader:{
                type:'json',
                root:'gridList',
                totalPreperty:'total'
            }
        }
    });

    store.load({
       params:{
           start:0,
           limit:itemsPerPage
       }
    });

    Ext.create('Ext.grid.Panel',{
        title:'城市',
        store:'store',
        columns:[
            {header:'城市编号',dataIndex:'cityId'},
            {header:'城市名称',dataIndex:'cityName'}
        ],
       height:200,
       width:400,
       dockedItems:[{
           xtype: 'pagingtoolbar',
           store: store,
           dock: 'bottom',
           displayInfo: true
       }],
        renderTo: Ext.getBody()
    });
});