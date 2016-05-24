// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnLacpStatsEntryVer14 implements OFBsnLacpStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnLacpStatsEntryVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 36;

        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static int DEFAULT_ACTOR_SYS_PRIORITY = 0x0;
        private final static MacAddress DEFAULT_ACTOR_SYS_MAC = MacAddress.NONE;
        private final static int DEFAULT_ACTOR_PORT_PRIORITY = 0x0;
        private final static int DEFAULT_ACTOR_PORT_NUM = 0x0;
        private final static int DEFAULT_ACTOR_KEY = 0x0;
        private final static short DEFAULT_CONVERGENCE_STATUS = (short) 0x0;
        private final static int DEFAULT_PARTNER_SYS_PRIORITY = 0x0;
        private final static MacAddress DEFAULT_PARTNER_SYS_MAC = MacAddress.NONE;
        private final static int DEFAULT_PARTNER_PORT_PRIORITY = 0x0;
        private final static int DEFAULT_PARTNER_PORT_NUM = 0x0;
        private final static int DEFAULT_PARTNER_KEY = 0x0;

    // OF message fields
    private final OFPort portNo;
    private final int actorSysPriority;
    private final MacAddress actorSysMac;
    private final int actorPortPriority;
    private final int actorPortNum;
    private final int actorKey;
    private final short convergenceStatus;
    private final int partnerSysPriority;
    private final MacAddress partnerSysMac;
    private final int partnerPortPriority;
    private final int partnerPortNum;
    private final int partnerKey;
//
    // Immutable default instance
    final static OFBsnLacpStatsEntryVer14 DEFAULT = new OFBsnLacpStatsEntryVer14(
        DEFAULT_PORT_NO, DEFAULT_ACTOR_SYS_PRIORITY, DEFAULT_ACTOR_SYS_MAC, DEFAULT_ACTOR_PORT_PRIORITY, DEFAULT_ACTOR_PORT_NUM, DEFAULT_ACTOR_KEY, DEFAULT_CONVERGENCE_STATUS, DEFAULT_PARTNER_SYS_PRIORITY, DEFAULT_PARTNER_SYS_MAC, DEFAULT_PARTNER_PORT_PRIORITY, DEFAULT_PARTNER_PORT_NUM, DEFAULT_PARTNER_KEY
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnLacpStatsEntryVer14(OFPort portNo, int actorSysPriority, MacAddress actorSysMac, int actorPortPriority, int actorPortNum, int actorKey, short convergenceStatus, int partnerSysPriority, MacAddress partnerSysMac, int partnerPortPriority, int partnerPortNum, int partnerKey) {
        if(portNo == null) {
            throw new NullPointerException("OFBsnLacpStatsEntryVer14: property portNo cannot be null");
        }
        if(actorSysMac == null) {
            throw new NullPointerException("OFBsnLacpStatsEntryVer14: property actorSysMac cannot be null");
        }
        if(partnerSysMac == null) {
            throw new NullPointerException("OFBsnLacpStatsEntryVer14: property partnerSysMac cannot be null");
        }
        this.portNo = portNo;
        this.actorSysPriority = actorSysPriority;
        this.actorSysMac = actorSysMac;
        this.actorPortPriority = actorPortPriority;
        this.actorPortNum = actorPortNum;
        this.actorKey = actorKey;
        this.convergenceStatus = convergenceStatus;
        this.partnerSysPriority = partnerSysPriority;
        this.partnerSysMac = partnerSysMac;
        this.partnerPortPriority = partnerPortPriority;
        this.partnerPortNum = partnerPortNum;
        this.partnerKey = partnerKey;
    }

    // Accessors for OF message fields
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public short getConvergenceStatus() {
        return convergenceStatus;
    }

    @Override
    public int getPartnerSysPriority() {
        return partnerSysPriority;
    }

    @Override
    public MacAddress getPartnerSysMac() {
        return partnerSysMac;
    }

    @Override
    public int getPartnerPortPriority() {
        return partnerPortPriority;
    }

    @Override
    public int getPartnerPortNum() {
        return partnerPortNum;
    }

    @Override
    public int getPartnerKey() {
        return partnerKey;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnLacpStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnLacpStatsEntry.Builder {
        final OFBsnLacpStatsEntryVer14 parentMessage;

        // OF message fields
        private boolean portNoSet;
        private OFPort portNo;
        private boolean actorSysPrioritySet;
        private int actorSysPriority;
        private boolean actorSysMacSet;
        private MacAddress actorSysMac;
        private boolean actorPortPrioritySet;
        private int actorPortPriority;
        private boolean actorPortNumSet;
        private int actorPortNum;
        private boolean actorKeySet;
        private int actorKey;
        private boolean convergenceStatusSet;
        private short convergenceStatus;
        private boolean partnerSysPrioritySet;
        private int partnerSysPriority;
        private boolean partnerSysMacSet;
        private MacAddress partnerSysMac;
        private boolean partnerPortPrioritySet;
        private int partnerPortPriority;
        private boolean partnerPortNumSet;
        private int partnerPortNum;
        private boolean partnerKeySet;
        private int partnerKey;

        BuilderWithParent(OFBsnLacpStatsEntryVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorSysPriority(int actorSysPriority) {
        this.actorSysPriority = actorSysPriority;
        this.actorSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorSysMac(MacAddress actorSysMac) {
        this.actorSysMac = actorSysMac;
        this.actorSysMacSet = true;
        return this;
    }
    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorPortPriority(int actorPortPriority) {
        this.actorPortPriority = actorPortPriority;
        this.actorPortPrioritySet = true;
        return this;
    }
    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorPortNum(int actorPortNum) {
        this.actorPortNum = actorPortNum;
        this.actorPortNumSet = true;
        return this;
    }
    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorKey(int actorKey) {
        this.actorKey = actorKey;
        this.actorKeySet = true;
        return this;
    }
    @Override
    public short getConvergenceStatus() {
        return convergenceStatus;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setConvergenceStatus(short convergenceStatus) {
        this.convergenceStatus = convergenceStatus;
        this.convergenceStatusSet = true;
        return this;
    }
    @Override
    public int getPartnerSysPriority() {
        return partnerSysPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerSysPriority(int partnerSysPriority) {
        this.partnerSysPriority = partnerSysPriority;
        this.partnerSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getPartnerSysMac() {
        return partnerSysMac;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerSysMac(MacAddress partnerSysMac) {
        this.partnerSysMac = partnerSysMac;
        this.partnerSysMacSet = true;
        return this;
    }
    @Override
    public int getPartnerPortPriority() {
        return partnerPortPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerPortPriority(int partnerPortPriority) {
        this.partnerPortPriority = partnerPortPriority;
        this.partnerPortPrioritySet = true;
        return this;
    }
    @Override
    public int getPartnerPortNum() {
        return partnerPortNum;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerPortNum(int partnerPortNum) {
        this.partnerPortNum = partnerPortNum;
        this.partnerPortNumSet = true;
        return this;
    }
    @Override
    public int getPartnerKey() {
        return partnerKey;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerKey(int partnerKey) {
        this.partnerKey = partnerKey;
        this.partnerKeySet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnLacpStatsEntry build() {
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                int actorSysPriority = this.actorSysPrioritySet ? this.actorSysPriority : parentMessage.actorSysPriority;
                MacAddress actorSysMac = this.actorSysMacSet ? this.actorSysMac : parentMessage.actorSysMac;
                if(actorSysMac == null)
                    throw new NullPointerException("Property actorSysMac must not be null");
                int actorPortPriority = this.actorPortPrioritySet ? this.actorPortPriority : parentMessage.actorPortPriority;
                int actorPortNum = this.actorPortNumSet ? this.actorPortNum : parentMessage.actorPortNum;
                int actorKey = this.actorKeySet ? this.actorKey : parentMessage.actorKey;
                short convergenceStatus = this.convergenceStatusSet ? this.convergenceStatus : parentMessage.convergenceStatus;
                int partnerSysPriority = this.partnerSysPrioritySet ? this.partnerSysPriority : parentMessage.partnerSysPriority;
                MacAddress partnerSysMac = this.partnerSysMacSet ? this.partnerSysMac : parentMessage.partnerSysMac;
                if(partnerSysMac == null)
                    throw new NullPointerException("Property partnerSysMac must not be null");
                int partnerPortPriority = this.partnerPortPrioritySet ? this.partnerPortPriority : parentMessage.partnerPortPriority;
                int partnerPortNum = this.partnerPortNumSet ? this.partnerPortNum : parentMessage.partnerPortNum;
                int partnerKey = this.partnerKeySet ? this.partnerKey : parentMessage.partnerKey;

                //
                return new OFBsnLacpStatsEntryVer14(
                    portNo,
                    actorSysPriority,
                    actorSysMac,
                    actorPortPriority,
                    actorPortNum,
                    actorKey,
                    convergenceStatus,
                    partnerSysPriority,
                    partnerSysMac,
                    partnerPortPriority,
                    partnerPortNum,
                    partnerKey
                );
        }

    }

    static class Builder implements OFBsnLacpStatsEntry.Builder {
        // OF message fields
        private boolean portNoSet;
        private OFPort portNo;
        private boolean actorSysPrioritySet;
        private int actorSysPriority;
        private boolean actorSysMacSet;
        private MacAddress actorSysMac;
        private boolean actorPortPrioritySet;
        private int actorPortPriority;
        private boolean actorPortNumSet;
        private int actorPortNum;
        private boolean actorKeySet;
        private int actorKey;
        private boolean convergenceStatusSet;
        private short convergenceStatus;
        private boolean partnerSysPrioritySet;
        private int partnerSysPriority;
        private boolean partnerSysMacSet;
        private MacAddress partnerSysMac;
        private boolean partnerPortPrioritySet;
        private int partnerPortPriority;
        private boolean partnerPortNumSet;
        private int partnerPortNum;
        private boolean partnerKeySet;
        private int partnerKey;

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorSysPriority(int actorSysPriority) {
        this.actorSysPriority = actorSysPriority;
        this.actorSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorSysMac(MacAddress actorSysMac) {
        this.actorSysMac = actorSysMac;
        this.actorSysMacSet = true;
        return this;
    }
    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorPortPriority(int actorPortPriority) {
        this.actorPortPriority = actorPortPriority;
        this.actorPortPrioritySet = true;
        return this;
    }
    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorPortNum(int actorPortNum) {
        this.actorPortNum = actorPortNum;
        this.actorPortNumSet = true;
        return this;
    }
    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setActorKey(int actorKey) {
        this.actorKey = actorKey;
        this.actorKeySet = true;
        return this;
    }
    @Override
    public short getConvergenceStatus() {
        return convergenceStatus;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setConvergenceStatus(short convergenceStatus) {
        this.convergenceStatus = convergenceStatus;
        this.convergenceStatusSet = true;
        return this;
    }
    @Override
    public int getPartnerSysPriority() {
        return partnerSysPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerSysPriority(int partnerSysPriority) {
        this.partnerSysPriority = partnerSysPriority;
        this.partnerSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getPartnerSysMac() {
        return partnerSysMac;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerSysMac(MacAddress partnerSysMac) {
        this.partnerSysMac = partnerSysMac;
        this.partnerSysMacSet = true;
        return this;
    }
    @Override
    public int getPartnerPortPriority() {
        return partnerPortPriority;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerPortPriority(int partnerPortPriority) {
        this.partnerPortPriority = partnerPortPriority;
        this.partnerPortPrioritySet = true;
        return this;
    }
    @Override
    public int getPartnerPortNum() {
        return partnerPortNum;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerPortNum(int partnerPortNum) {
        this.partnerPortNum = partnerPortNum;
        this.partnerPortNumSet = true;
        return this;
    }
    @Override
    public int getPartnerKey() {
        return partnerKey;
    }

    @Override
    public OFBsnLacpStatsEntry.Builder setPartnerKey(int partnerKey) {
        this.partnerKey = partnerKey;
        this.partnerKeySet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnLacpStatsEntry build() {
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            int actorSysPriority = this.actorSysPrioritySet ? this.actorSysPriority : DEFAULT_ACTOR_SYS_PRIORITY;
            MacAddress actorSysMac = this.actorSysMacSet ? this.actorSysMac : DEFAULT_ACTOR_SYS_MAC;
            if(actorSysMac == null)
                throw new NullPointerException("Property actorSysMac must not be null");
            int actorPortPriority = this.actorPortPrioritySet ? this.actorPortPriority : DEFAULT_ACTOR_PORT_PRIORITY;
            int actorPortNum = this.actorPortNumSet ? this.actorPortNum : DEFAULT_ACTOR_PORT_NUM;
            int actorKey = this.actorKeySet ? this.actorKey : DEFAULT_ACTOR_KEY;
            short convergenceStatus = this.convergenceStatusSet ? this.convergenceStatus : DEFAULT_CONVERGENCE_STATUS;
            int partnerSysPriority = this.partnerSysPrioritySet ? this.partnerSysPriority : DEFAULT_PARTNER_SYS_PRIORITY;
            MacAddress partnerSysMac = this.partnerSysMacSet ? this.partnerSysMac : DEFAULT_PARTNER_SYS_MAC;
            if(partnerSysMac == null)
                throw new NullPointerException("Property partnerSysMac must not be null");
            int partnerPortPriority = this.partnerPortPrioritySet ? this.partnerPortPriority : DEFAULT_PARTNER_PORT_PRIORITY;
            int partnerPortNum = this.partnerPortNumSet ? this.partnerPortNum : DEFAULT_PARTNER_PORT_NUM;
            int partnerKey = this.partnerKeySet ? this.partnerKey : DEFAULT_PARTNER_KEY;


            return new OFBsnLacpStatsEntryVer14(
                    portNo,
                    actorSysPriority,
                    actorSysMac,
                    actorPortPriority,
                    actorPortNum,
                    actorKey,
                    convergenceStatus,
                    partnerSysPriority,
                    partnerSysMac,
                    partnerPortPriority,
                    partnerPortNum,
                    partnerKey
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnLacpStatsEntry> {
        @Override
        public OFBsnLacpStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            OFPort portNo = OFPort.read4Bytes(bb);
            int actorSysPriority = U16.f(bb.readShort());
            MacAddress actorSysMac = MacAddress.read6Bytes(bb);
            int actorPortPriority = U16.f(bb.readShort());
            int actorPortNum = U16.f(bb.readShort());
            int actorKey = U16.f(bb.readShort());
            short convergenceStatus = U8.f(bb.readByte());
            // pad: 1 bytes
            bb.skipBytes(1);
            int partnerSysPriority = U16.f(bb.readShort());
            MacAddress partnerSysMac = MacAddress.read6Bytes(bb);
            int partnerPortPriority = U16.f(bb.readShort());
            int partnerPortNum = U16.f(bb.readShort());
            int partnerKey = U16.f(bb.readShort());
            // pad: 2 bytes
            bb.skipBytes(2);

            OFBsnLacpStatsEntryVer14 bsnLacpStatsEntryVer14 = new OFBsnLacpStatsEntryVer14(
                    portNo,
                      actorSysPriority,
                      actorSysMac,
                      actorPortPriority,
                      actorPortNum,
                      actorKey,
                      convergenceStatus,
                      partnerSysPriority,
                      partnerSysMac,
                      partnerPortPriority,
                      partnerPortNum,
                      partnerKey
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnLacpStatsEntryVer14);
            return bsnLacpStatsEntryVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnLacpStatsEntryVer14Funnel FUNNEL = new OFBsnLacpStatsEntryVer14Funnel();
    static class OFBsnLacpStatsEntryVer14Funnel implements Funnel<OFBsnLacpStatsEntryVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnLacpStatsEntryVer14 message, PrimitiveSink sink) {
            message.portNo.putTo(sink);
            sink.putInt(message.actorSysPriority);
            message.actorSysMac.putTo(sink);
            sink.putInt(message.actorPortPriority);
            sink.putInt(message.actorPortNum);
            sink.putInt(message.actorKey);
            sink.putShort(message.convergenceStatus);
            // skip pad (1 bytes)
            sink.putInt(message.partnerSysPriority);
            message.partnerSysMac.putTo(sink);
            sink.putInt(message.partnerPortPriority);
            sink.putInt(message.partnerPortNum);
            sink.putInt(message.partnerKey);
            // skip pad (2 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnLacpStatsEntryVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnLacpStatsEntryVer14 message) {
            message.portNo.write4Bytes(bb);
            bb.writeShort(U16.t(message.actorSysPriority));
            message.actorSysMac.write6Bytes(bb);
            bb.writeShort(U16.t(message.actorPortPriority));
            bb.writeShort(U16.t(message.actorPortNum));
            bb.writeShort(U16.t(message.actorKey));
            bb.writeByte(U8.t(message.convergenceStatus));
            // pad: 1 bytes
            bb.writeZero(1);
            bb.writeShort(U16.t(message.partnerSysPriority));
            message.partnerSysMac.write6Bytes(bb);
            bb.writeShort(U16.t(message.partnerPortPriority));
            bb.writeShort(U16.t(message.partnerPortNum));
            bb.writeShort(U16.t(message.partnerKey));
            // pad: 2 bytes
            bb.writeZero(2);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnLacpStatsEntryVer14(");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("actorSysPriority=").append(actorSysPriority);
        b.append(", ");
        b.append("actorSysMac=").append(actorSysMac);
        b.append(", ");
        b.append("actorPortPriority=").append(actorPortPriority);
        b.append(", ");
        b.append("actorPortNum=").append(actorPortNum);
        b.append(", ");
        b.append("actorKey=").append(actorKey);
        b.append(", ");
        b.append("convergenceStatus=").append(convergenceStatus);
        b.append(", ");
        b.append("partnerSysPriority=").append(partnerSysPriority);
        b.append(", ");
        b.append("partnerSysMac=").append(partnerSysMac);
        b.append(", ");
        b.append("partnerPortPriority=").append(partnerPortPriority);
        b.append(", ");
        b.append("partnerPortNum=").append(partnerPortNum);
        b.append(", ");
        b.append("partnerKey=").append(partnerKey);
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
        OFBsnLacpStatsEntryVer14 other = (OFBsnLacpStatsEntryVer14) obj;

        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( actorSysPriority != other.actorSysPriority)
            return false;
        if (actorSysMac == null) {
            if (other.actorSysMac != null)
                return false;
        } else if (!actorSysMac.equals(other.actorSysMac))
            return false;
        if( actorPortPriority != other.actorPortPriority)
            return false;
        if( actorPortNum != other.actorPortNum)
            return false;
        if( actorKey != other.actorKey)
            return false;
        if( convergenceStatus != other.convergenceStatus)
            return false;
        if( partnerSysPriority != other.partnerSysPriority)
            return false;
        if (partnerSysMac == null) {
            if (other.partnerSysMac != null)
                return false;
        } else if (!partnerSysMac.equals(other.partnerSysMac))
            return false;
        if( partnerPortPriority != other.partnerPortPriority)
            return false;
        if( partnerPortNum != other.partnerPortNum)
            return false;
        if( partnerKey != other.partnerKey)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + actorSysPriority;
        result = prime * result + ((actorSysMac == null) ? 0 : actorSysMac.hashCode());
        result = prime * result + actorPortPriority;
        result = prime * result + actorPortNum;
        result = prime * result + actorKey;
        result = prime * result + convergenceStatus;
        result = prime * result + partnerSysPriority;
        result = prime * result + ((partnerSysMac == null) ? 0 : partnerSysMac.hashCode());
        result = prime * result + partnerPortPriority;
        result = prime * result + partnerPortNum;
        result = prime * result + partnerKey;
        return result;
    }

}
