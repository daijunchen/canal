package com.taobao.tddl.dbsync.binlog.event.mariadb;import com.taobao.tddl.dbsync.binlog.LogBuffer;import com.taobao.tddl.dbsync.binlog.event.DeleteRowsLogEvent;import com.taobao.tddl.dbsync.binlog.event.FormatDescriptionLogEvent;import com.taobao.tddl.dbsync.binlog.event.LogHeader;/** * mariadb compress rows event *  * @author jianghang * @since 1.1.7 */public class DeleteRowsCompressLogEvent extends DeleteRowsLogEvent {    public DeleteRowsCompressLogEvent(LogHeader header, LogBuffer buffer, FormatDescriptionLogEvent descriptionEvent){        super(header, buffer, descriptionEvent, true);    }}