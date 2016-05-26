// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnSetLacpReplyVer15 implements OFBsnSetLacpReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnSetLacpReplyVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_STATUS = 0x0L;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;

    // OF message fields
    private final long xid;
    private final long status;
    private final OFPort portNo;
//
    // Immutable default instance
    final static OFBsnSetLacpReplyVer15 DEFAULT = new OFBsnSetLacpReplyVer15(
        DEFAULT_XID, DEFAULT_STATUS, DEFAULT_PORT_NO
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnSetLacpReplyVer15(long xid, long status, OFPort portNo) {
        if(portNo == null) {
            throw new NullPointerException("OFBsnSetLacpReplyVer15: property portNo cannot be null");
        }
        this.xid = xid;
        this.status = status;
        this.portNo = portNo;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x2aL;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }



    public OFBsnSetLacpReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnSetLacpReply.Builder {
        final OFBsnSetLacpReplyVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;
        private boolean portNoSet;
        private OFPort portNo;

        BuilderWithParent(OFBsnSetLacpReplyVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnSetLacpReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x2aL;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnSetLacpReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnSetLacpReply.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }


        @Override
        public OFBsnSetLacpReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long status = this.statusSet ? this.status : parentMessage.status;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");

                //
                return new OFBsnSetLacpReplyVer15(
                    xid,
                    status,
                    portNo
                );
        }

    }

    static class Builder implements OFBsnSetLacpReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;
        private boolean portNoSet;
        private OFPort portNo;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnSetLacpReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x2aL;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnSetLacpReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnSetLacpReply.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
//
        @Override
        public OFBsnSetLacpReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long status = this.statusSet ? this.status : DEFAULT_STATUS;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");


            return new OFBsnSetLacpReplyVer15(
                    xid,
                    status,
                    portNo
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnSetLacpReply> {
        @Override
        public OFBsnSetLacpReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 24)
                throw new OFParseError("Wrong length: Expected=24(24), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x2aL
            int subtype = bb.readInt();
            if(subtype != 0x2a)
                throw new OFParseError("Wrong subtype: Expected=0x2aL(0x2aL), got="+subtype);
            long status = U32.f(bb.readInt());
            OFPort portNo = OFPort.read4Bytes(bb);

            OFBsnSetLacpReplyVer15 bsnSetLacpReplyVer15 = new OFBsnSetLacpReplyVer15(
                    xid,
                      status,
                      portNo
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnSetLacpReplyVer15);
            return bsnSetLacpReplyVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnSetLacpReplyVer15Funnel FUNNEL = new OFBsnSetLacpReplyVer15Funnel();
    static class OFBsnSetLacpReplyVer15Funnel implements Funnel<OFBsnSetLacpReplyVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnSetLacpReplyVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 24
            sink.putShort((short) 0x18);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x2aL
            sink.putInt(0x2a);
            sink.putLong(message.status);
            message.portNo.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnSetLacpReplyVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnSetLacpReplyVer15 message) {
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 24
            bb.writeShort((short) 0x18);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x2aL
            bb.writeInt(0x2a);
            bb.writeInt(U32.t(message.status));
            message.portNo.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnSetLacpReplyVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("status=").append(status);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnSetLacpReplyVer15 other = (OFBsnSetLacpReplyVer15) obj;

        if( xid != other.xid)
            return false;
        if( status != other.status)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime *  (int) (status ^ (status >>> 32));
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        return result;
    }

}
