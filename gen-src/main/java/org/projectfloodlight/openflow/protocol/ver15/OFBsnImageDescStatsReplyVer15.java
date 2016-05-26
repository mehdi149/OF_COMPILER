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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnImageDescStatsReplyVer15 implements OFBsnImageDescStatsReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnImageDescStatsReplyVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 536;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFStatsReplyFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsReplyFlags>of();
        private final static String DEFAULT_IMAGE_CHECKSUM = "";
        private final static String DEFAULT_STARTUP_CONFIG_CHECKSUM = "";

    // OF message fields
    private final long xid;
    private final Set<OFStatsReplyFlags> flags;
    private final String imageChecksum;
    private final String startupConfigChecksum;
//
    // Immutable default instance
    final static OFBsnImageDescStatsReplyVer15 DEFAULT = new OFBsnImageDescStatsReplyVer15(
        DEFAULT_XID, DEFAULT_FLAGS, DEFAULT_IMAGE_CHECKSUM, DEFAULT_STARTUP_CONFIG_CHECKSUM
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnImageDescStatsReplyVer15(long xid, Set<OFStatsReplyFlags> flags, String imageChecksum, String startupConfigChecksum) {
        if(flags == null) {
            throw new NullPointerException("OFBsnImageDescStatsReplyVer15: property flags cannot be null");
        }
        if(imageChecksum == null) {
            throw new NullPointerException("OFBsnImageDescStatsReplyVer15: property imageChecksum cannot be null");
        }
        if(startupConfigChecksum == null) {
            throw new NullPointerException("OFBsnImageDescStatsReplyVer15: property startupConfigChecksum cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
        this.imageChecksum = imageChecksum;
        this.startupConfigChecksum = startupConfigChecksum;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xeL;
    }

    @Override
    public String getImageChecksum() {
        return imageChecksum;
    }

    @Override
    public String getStartupConfigChecksum() {
        return startupConfigChecksum;
    }



    public OFBsnImageDescStatsReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnImageDescStatsReply.Builder {
        final OFBsnImageDescStatsReplyVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean imageChecksumSet;
        private String imageChecksum;
        private boolean startupConfigChecksumSet;
        private String startupConfigChecksum;

        BuilderWithParent(OFBsnImageDescStatsReplyVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xeL;
    }

    @Override
    public String getImageChecksum() {
        return imageChecksum;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setImageChecksum(String imageChecksum) {
        this.imageChecksum = imageChecksum;
        this.imageChecksumSet = true;
        return this;
    }
    @Override
    public String getStartupConfigChecksum() {
        return startupConfigChecksum;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setStartupConfigChecksum(String startupConfigChecksum) {
        this.startupConfigChecksum = startupConfigChecksum;
        this.startupConfigChecksumSet = true;
        return this;
    }


        @Override
        public OFBsnImageDescStatsReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                String imageChecksum = this.imageChecksumSet ? this.imageChecksum : parentMessage.imageChecksum;
                if(imageChecksum == null)
                    throw new NullPointerException("Property imageChecksum must not be null");
                String startupConfigChecksum = this.startupConfigChecksumSet ? this.startupConfigChecksum : parentMessage.startupConfigChecksum;
                if(startupConfigChecksum == null)
                    throw new NullPointerException("Property startupConfigChecksum must not be null");

                //
                return new OFBsnImageDescStatsReplyVer15(
                    xid,
                    flags,
                    imageChecksum,
                    startupConfigChecksum
                );
        }

    }

    static class Builder implements OFBsnImageDescStatsReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean imageChecksumSet;
        private String imageChecksum;
        private boolean startupConfigChecksumSet;
        private String startupConfigChecksum;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xeL;
    }

    @Override
    public String getImageChecksum() {
        return imageChecksum;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setImageChecksum(String imageChecksum) {
        this.imageChecksum = imageChecksum;
        this.imageChecksumSet = true;
        return this;
    }
    @Override
    public String getStartupConfigChecksum() {
        return startupConfigChecksum;
    }

    @Override
    public OFBsnImageDescStatsReply.Builder setStartupConfigChecksum(String startupConfigChecksum) {
        this.startupConfigChecksum = startupConfigChecksum;
        this.startupConfigChecksumSet = true;
        return this;
    }
//
        @Override
        public OFBsnImageDescStatsReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            String imageChecksum = this.imageChecksumSet ? this.imageChecksum : DEFAULT_IMAGE_CHECKSUM;
            if(imageChecksum == null)
                throw new NullPointerException("Property imageChecksum must not be null");
            String startupConfigChecksum = this.startupConfigChecksumSet ? this.startupConfigChecksum : DEFAULT_STARTUP_CONFIG_CHECKSUM;
            if(startupConfigChecksum == null)
                throw new NullPointerException("Property startupConfigChecksum must not be null");


            return new OFBsnImageDescStatsReplyVer15(
                    xid,
                    flags,
                    imageChecksum,
                    startupConfigChecksum
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnImageDescStatsReply> {
        @Override
        public OFBsnImageDescStatsReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 19
            byte type = bb.readByte();
            if(type != (byte) 0x13)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY(19), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 536)
                throw new OFParseError("Wrong length: Expected=536(536), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property statsType == 65535
            short statsType = bb.readShort();
            if(statsType != (short) 0xffff)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.EXPERIMENTER(65535), got="+statsType);
            Set<OFStatsReplyFlags> flags = OFStatsReplyFlagsSerializerVer15.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0xeL
            int subtype = bb.readInt();
            if(subtype != 0xe)
                throw new OFParseError("Wrong subtype: Expected=0xeL(0xeL), got="+subtype);
            String imageChecksum = ChannelUtils.readFixedLengthString(bb, 256);
            String startupConfigChecksum = ChannelUtils.readFixedLengthString(bb, 256);

            OFBsnImageDescStatsReplyVer15 bsnImageDescStatsReplyVer15 = new OFBsnImageDescStatsReplyVer15(
                    xid,
                      flags,
                      imageChecksum,
                      startupConfigChecksum
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnImageDescStatsReplyVer15);
            return bsnImageDescStatsReplyVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnImageDescStatsReplyVer15Funnel FUNNEL = new OFBsnImageDescStatsReplyVer15Funnel();
    static class OFBsnImageDescStatsReplyVer15Funnel implements Funnel<OFBsnImageDescStatsReplyVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnImageDescStatsReplyVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 19
            sink.putByte((byte) 0x13);
            // fixed value property length = 536
            sink.putShort((short) 0x218);
            sink.putLong(message.xid);
            // fixed value property statsType = 65535
            sink.putShort((short) 0xffff);
            OFStatsReplyFlagsSerializerVer15.putTo(message.flags, sink);
            // skip pad (4 bytes)
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0xeL
            sink.putInt(0xe);
            sink.putUnencodedChars(message.imageChecksum);
            sink.putUnencodedChars(message.startupConfigChecksum);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnImageDescStatsReplyVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnImageDescStatsReplyVer15 message) {
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 19
            bb.writeByte((byte) 0x13);
            // fixed value property length = 536
            bb.writeShort((short) 0x218);
            bb.writeInt(U32.t(message.xid));
            // fixed value property statsType = 65535
            bb.writeShort((short) 0xffff);
            OFStatsReplyFlagsSerializerVer15.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0xeL
            bb.writeInt(0xe);
            ChannelUtils.writeFixedLengthString(bb, message.imageChecksum, 256);
            ChannelUtils.writeFixedLengthString(bb, message.startupConfigChecksum, 256);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnImageDescStatsReplyVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("imageChecksum=").append(imageChecksum);
        b.append(", ");
        b.append("startupConfigChecksum=").append(startupConfigChecksum);
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
        OFBsnImageDescStatsReplyVer15 other = (OFBsnImageDescStatsReplyVer15) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (imageChecksum == null) {
            if (other.imageChecksum != null)
                return false;
        } else if (!imageChecksum.equals(other.imageChecksum))
            return false;
        if (startupConfigChecksum == null) {
            if (other.startupConfigChecksum != null)
                return false;
        } else if (!startupConfigChecksum.equals(other.startupConfigChecksum))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((imageChecksum == null) ? 0 : imageChecksum.hashCode());
        result = prime * result + ((startupConfigChecksum == null) ? 0 : startupConfigChecksum.hashCode());
        return result;
    }

}
