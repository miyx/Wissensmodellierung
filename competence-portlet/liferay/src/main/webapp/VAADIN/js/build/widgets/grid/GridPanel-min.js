/*
 * Ext JS Library 2.0.2
 * Copyright(c) 2006-2008, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */

Ext.grid.GridPanel=Ext.extend(Ext.Panel,{ddText:"{0} selected row{1}",minColumnWidth:25,trackMouseOver:true,enableDragDrop:false,enableColumnMove:true,enableColumnHide:true,enableHdMenu:true,stripeRows:false,autoExpandColumn:false,autoExpandMin:50,autoExpandMax:1000,view:null,loadMask:false,rendered:false,viewReady:false,stateEvents:["columnmove","columnresize","sortchange"],initComponent:function(){Ext.grid.GridPanel.superclass.initComponent.call(this);this.autoScroll=false;this.autoWidth=false;if(Ext.isArray(this.columns)){this.colModel=new Ext.grid.ColumnModel(this.columns);delete this.columns}if(this.ds){this.store=this.ds;delete this.ds}if(this.cm){this.colModel=this.cm;delete this.cm}if(this.sm){this.selModel=this.sm;delete this.sm}this.store=Ext.StoreMgr.lookup(this.store);this.addEvents("click","dblclick","contextmenu","mousedown","mouseup","mouseover","mouseout","keypress","keydown","cellmousedown","rowmousedown","headermousedown","cellclick","celldblclick","rowclick","rowdblclick","headerclick","headerdblclick","rowcontextmenu","cellcontextmenu","headercontextmenu","bodyscroll","columnresize","columnmove","sortchange")},onRender:function(C,A){Ext.grid.GridPanel.superclass.onRender.apply(this,arguments);var D=this.body;this.el.addClass("x-grid-panel");var B=this.getView();B.init(this);D.on("mousedown",this.onMouseDown,this);D.on("click",this.onClick,this);D.on("dblclick",this.onDblClick,this);D.on("contextmenu",this.onContextMenu,this);D.on("keydown",this.onKeyDown,this);this.relayEvents(D,["mousedown","mouseup","mouseover","mouseout","keypress"]);this.getSelectionModel().init(this);this.view.render()},initEvents:function(){Ext.grid.GridPanel.superclass.initEvents.call(this);if(this.loadMask){this.loadMask=new Ext.LoadMask(this.bwrap,Ext.apply({store:this.store},this.loadMask))}},initStateEvents:function(){Ext.grid.GridPanel.superclass.initStateEvents.call(this);this.colModel.on("hiddenchange",this.saveState,this,{delay:100})},applyState:function(F){var B=this.colModel;var E=F.columns;if(E){for(var C=0,A=E.length;C<A;C++){var D=E[C];var H=B.getColumnById(D.id);if(H){H.hidden=D.hidden;H.width=D.width;var G=B.getIndexById(D.id);if(G!=C){B.moveColumn(G,C)}}}}if(F.sort){this.store[this.store.remoteSort?"setDefaultSort":"sort"](F.sort.field,F.sort.direction)}},getState:function(){var C={columns:[]};for(var B=0,D;D=this.colModel.config[B];B++){C.columns[B]={id:D.id,width:D.width};if(D.hidden){C.columns[B].hidden=true}}var A=this.store.getSortState();if(A){C.sort=A}return C},afterRender:function(){Ext.grid.GridPanel.superclass.afterRender.call(this);this.view.layout();this.viewReady=true},reconfigure:function(A,B){if(this.loadMask){this.loadMask.destroy();this.loadMask=new Ext.LoadMask(this.bwrap,Ext.apply({store:A},this.initialConfig.loadMask))}this.view.bind(A,B);this.store=A;this.colModel=B;if(this.rendered){this.view.refresh(true)}},onKeyDown:function(A){this.fireEvent("keydown",A)},onDestroy:function(){if(this.rendered){if(this.loadMask){this.loadMask.destroy()}var A=this.body;A.removeAllListeners();this.view.destroy();A.update("")}this.colModel.purgeListeners();Ext.grid.GridPanel.superclass.onDestroy.call(this)},processEvent:function(C,E){this.fireEvent(C,E);var D=E.getTarget();var B=this.view;var G=B.findHeaderIndex(D);if(G!==false){this.fireEvent("header"+C,this,G,E)}else{var F=B.findRowIndex(D);var A=B.findCellIndex(D);if(F!==false){this.fireEvent("row"+C,this,F,E);if(A!==false){this.fireEvent("cell"+C,this,F,A,E)}}}},onClick:function(A){this.processEvent("click",A)},onMouseDown:function(A){this.processEvent("mousedown",A)},onContextMenu:function(B,A){this.processEvent("contextmenu",B)},onDblClick:function(A){this.processEvent("dblclick",A)},walkCells:function(J,C,B,E,I){var H=this.colModel,F=H.getColumnCount();var A=this.store,G=A.getCount(),D=true;if(B<0){if(C<0){J--;D=false}while(J>=0){if(!D){C=F-1}D=false;while(C>=0){if(E.call(I||this,J,C,H)===true){return[J,C]}C--}J--}}else{if(C>=F){J++;D=false}while(J<G){if(!D){C=0}D=false;while(C<F){if(E.call(I||this,J,C,H)===true){return[J,C]}C++}J++}}return null},getSelections:function(){return this.selModel.getSelections()},onResize:function(){Ext.grid.GridPanel.superclass.onResize.apply(this,arguments);if(this.viewReady){this.view.layout()}},getGridEl:function(){return this.body},stopEditing:function(){},getSelectionModel:function(){if(!this.selModel){this.selModel=new Ext.grid.RowSelectionModel(this.disableSelection?{selectRow:Ext.emptyFn}:null)}return this.selModel},getStore:function(){return this.store},getColumnModel:function(){return this.colModel},getView:function(){if(!this.view){this.view=new Ext.grid.GridView(this.viewConfig)}return this.view},getDragDropText:function(){var A=this.selModel.getCount();return String.format(this.ddText,A,A==1?"":"s")}});Ext.reg("grid",Ext.grid.GridPanel);