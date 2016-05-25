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
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFMeterModVer14 implements OFMeterMod {
    private static final Logger logger = LoggerFactory.getLogger(OFMeterModVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 16;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFMeterFlags> DEFAULT_FLAGS = ImmutableSet.<OFMeterFlags>of();
        private final static long DEFAULT_METER_ID = 0x0L;
        private final static List<OFMeterBand> DEFAULT_BANDS = ImmutableList.<OFMeterBand>of();

    // OF message fields
    private final long xid;
    private final OFMeterModCommand command;
    private final Set<OFMeterFlags> flags;
    private final long meterId;
    private final List<OFMeterBand> bands;
//

    // package private constructor - used by readers, builders, and factory
    OFMeterModVer14(long xid, OFMeterModCommand command, Set<OFMeterFlags> flags, long meterId, List<OFMeterBand> bands) {
        if(command == null) {
            throw new NullPointerException("OFMeterModVer14: property command cannot be null");
        }
        if(flags == null) {
            throw new NullPointerException("OFMeterModVer14: property flags cannot be null");
        }
        if(bands == null) {
            throw new NullPointerException("OFMeterModVer14: property bands cannot be null");
        }
        this.xid = xid;
        this.command = command;
        this.flags = flags;
        this.meterId = meterId;
        this.bands = bands;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.METER_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFMeterModCommand getCommand() {
        return command;
    }

    @Override
    public Set<OFMeterFlags> getFlags() {
        return flags;
    }

    @Override
    public long getMeterId() {
        return meterId;
    }

    @Override
    public List<OFMeterBand> getMeters()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property meters not supported in version 1.4");
    }

    @Override
    public List<OFMeterBand> getBands() {
        return bands;
    }



    public OFMeterMod.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFMeterMod.Builder {
        final OFMeterModVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean commandSet;
        private OFMeterModCommand command;
        private boolean flagsSet;
        private Set<OFMeterFlags> flags;
        private boolean meterIdSet;
        private long meterId;
        private boolean bandsSet;
        private List<OFMeterBand> bands;

        BuilderWithParent(OFMeterModVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.METER_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFMeterMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFMeterModCommand getCommand() {
        return command;
    }

    @Override
    public OFMeterMod.Builder setCommand(OFMeterModCommand command) {
        this.command = command;
        this.commandSet = true;
        return this;
    }
    @Override
    public Set<OFMeterFlags> getFlags() {
        return flags;
    }

    @Override
    public OFMeterMod.Builder setFlags(Set<OFMeterFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getMeterId() {
        return meterId;
    }

    @Override
    public OFMeterMod.Builder setMeterId(long meterId) {
        this.meterId = meterId;
        this.meterIdSet = true;
        return this;
    }
    @Override
    public List<OFMeterBand> getMeters()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property meters not supported in version 1.4");
    }

    @Override
    public OFMeterMod.Builder setMeters(List<OFMeterBand> meters) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property meters not supported in version 1.4");
    }
    @Override
    public List<OFMeterBand> getBands() {
        return bands;
    }

    @Override
    public OFMeterMod.Builder setBands(List<OFMeterBand> bands) {
        this.bands = bands;
        this.bandsSet = true;
        return this;
    }


        @Override
        public OFMeterMod build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFMeterModCommand command = this.commandSet ? this.command : parentMessage.command;
                if(command == null)
                    throw new NullPointerException("Property command must not be null");
                Set<OFMeterFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                long meterId = this.meterIdSet ? this.meterId : parentMessage.meterId;
                List<OFMeterBand> bands = this.bandsSet ? this.bands : parentMessage.bands;
                if(bands == null)
                    throw new NullPointerException("Property bands must not be null");

                //
                return new OFMeterModVer14(
                    xid,
                    command,
                    flags,
                    meterId,
                    bands
                );
        }

    }

    static class Builder implements OFMeterMod.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean commandSet;
        private OFMeterModCommand command;
        private boolean flagsSet;
        private Set<OFMeterFlags> flags;
        private boolean meterIdSet;
        private long meterId;
        private boolean bandsSet;
        private List<OFMeterBand> bands;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.METER_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFMeterMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFMeterModCommand getCommand() {
        return command;
    }

    @Override
    public OFMeterMod.Builder setCommand(OFMeterModCommand command) {
        this.command = command;
        this.commandSet = true;
        return this;
    }
    @Override
    public Set<OFMeterFlags> getFlags() {
        return flags;
    }

    @Override
    public OFMeterMod.Builder setFlags(Set<OFMeterFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getMeterId() {
        return meterId;
    }

    @Override
    public OFMeterMod.Builder setMeterId(long meterId) {
        this.meterId = meterId;
        this.meterIdSet = true;
        return this;
    }
    @Override
    public List<OFMeterBand> getMeters()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property meters not supported in version 1.4");
    }

    @Override
    public OFMeterMod.Builder setMeters(List<OFMeterBand> meters) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property meters not supported in version 1.4");
    }
    @Override
    public List<OFMeterBand> getBands() {
        return bands;
    }

    @Override
    public OFMeterMod.Builder setBands(List<OFMeterBand> bands) {
        this.bands = bands;
        this.bandsSet = true;
        return this;
    }
//
        @Override
        public OFMeterMod build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.commandSet)
                throw new IllegalStateException("Property command doesn't have default value -- must be set");
            if(command == null)
                throw new NullPointerException("Property command must not be null");
            Set<OFMeterFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            long meterId = this.meterIdSet ? this.meterId : DEFAULT_METER_ID;
            List<OFMeterBand> bands = this.bandsSet ? this.bands : DEFAULT_BANDS;
            if(bands == null)
                throw new NullPointerException("Property bands must not be null");


            return new OFMeterModVer14(
                    xid,
                    command,
                    flags,
                    meterId,
                    bands
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFMeterMod> {
        @Override
        public OFMeterMod readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 29
            byte type = bb.readByte();
            if(type != (byte) 0x1d)
                throw new OFParseError("Wrong type: Expected=OFType.METER_MOD(29), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            OFMeterModCommand command = OFMeterModCommandSerializerVer14.readFrom(bb);
            Set<OFMeterFlags> flags = OFMeterFlagsSerializerVer14.readFrom(bb);
            long meterId = U32.f(bb.readInt());
            List<OFMeterBand> bands = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFMeterBandVer14.READER);

            OFMeterModVer14 meterModVer14 = new OFMeterModVer14(
                    xid,
                      command,
                      flags,
                      meterId,
                      bands
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", meterModVer14);
            return meterModVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFMeterModVer14Funnel FUNNEL = new OFMeterModVer14Funnel();
    static class OFMeterModVer14Funnel implements Funnel<OFMeterModVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFMeterModVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 29
            sink.putByte((byte) 0x1d);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            OFMeterModCommandSerializerVer14.putTo(message.command, sink);
            OFMeterFlagsSerializerVer14.putTo(message.flags, sink);
            sink.putLong(message.meterId);
            FunnelUtils.putList(message.bands, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFMeterModVer14> {
        @Override
        public void write(ByteBuf bb, OFMeterModVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 29
            bb.writeByte((byte) 0x1d);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            OFMeterModCommandSerializerVer14.writeTo(bb, message.command);
            OFMeterFlagsSerializerVer14.writeTo(bb, message.flags);
            bb.writeInt(U32.t(message.meterId));
            ChannelUtils.writeList(bb, message.bands);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFMeterModVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("command=").append(command);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("meterId=").append(meterId);
        b.append(", ");
        b.append("bands=").append(bands);
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
        OFMeterModVer14 other = (OFMeterModVer14) obj;

        if( xid != other.xid)
            return false;
        if (command == null) {
            if (other.command != null)
                return false;
        } else if (!command.equals(other.command))
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if( meterId != other.meterId)
            return false;
        if (bands == null) {
            if (other.bands != null)
                return false;
        } else if (!bands.equals(other.bands))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((command == null) ? 0 : command.hashCode());
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime *  (int) (meterId ^ (meterId >>> 32));
        result = prime * result + ((bands == null) ? 0 : bands.hashCode());
        return result;
    }

}