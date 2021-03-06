/*
This file is part of Ext JS 4.2

Copyright (c) 2011-2014 Sencha Inc

Contact:  http://www.sencha.com/contact

Commercial Usage
Licensees holding valid commercial licenses may use this file in accordance with the Commercial
Software License Agreement provided with the Software or, alternatively, in accordance with the
terms contained in a written agreement between you and Sencha.

If you are unsure which license is appropriate for your use, please contact the sales department
at http://www.sencha.com/contact.

Build date: 2014-09-02 11:12:40 (ef1fa70924f51a26dacbe29644ca3f31501a5fce)
*/
/**
 * Supporting Class for Ext.Direct (not intended to be used directly).
 */
Ext.define('Ext.direct.Transaction', {
    alias: 'direct.transaction',
    alternateClassName: 'Ext.Direct.Transaction',
   
    statics: {
        TRANSACTION_ID: 0
    },
    
    /**
     * @cfg {Ext.direct.Provider} provider Provider to use with this Transaction.
     */
   
    /**
     * Creates new Transaction.
     * @param {Object} [config] Config object.
     */
    constructor: function(config) {
        var me = this;
        
        Ext.apply(me, config);

        me.id = me.tid = ++me.self.TRANSACTION_ID;
        me.retryCount = 0;
    },
   
    send: function() {
        var me = this;
        
        me.provider.queueTransaction(me);
    },

    retry: function() {
        var me = this;
        
        me.retryCount++;
        me.send();
    },

    getProvider: function() {
        return this.provider;
    }
});
