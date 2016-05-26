// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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

class OFBsnTlvUdfLengthVer13 implements OFBsnTlvUdfLength {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvUdfLengthVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;

        private final static int DEFAULT_VALUE = 0x0;

    // OF message fields
    private final int value;
//
    // Immutable default instance
    final static OFBsnTlvUdfLengthVer13 DEFAULT = new OFBsnTlvUdfLengthVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvUdfLengthVer13(int value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x12;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvUdfLength.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvUdfLength.Builder {
        final OFBsnTlvUdfLengthVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private int value;

        BuilderWithParent(OFBsnTlvUdfLengthVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x12;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFBsnTlvUdfLength.Builder setValue(int value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvUdfLength build() {
                int value = this.valueSet ? this.value : parentMessage.value;

                //
                return new OFBsnTlvUdfLengthVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvUdfLength.Builder {
        // OF message fields
        private boolean valueSet;
        private int value;

    @Override
    public int getType() {
        return 0x12;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public OFBsnTlvUdfLength.Builder setValue(int value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnTlvUdfLength build() {
            int value = this.valueSet ? this.value : DEFAULT_VALUE;


            return new OFBsnTlvUdfLengthVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvUdfLength> {
        @Override
        public OFBsnTlvUdfLength readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x12
            short type = bb.readShort();
            if(type != (short) 0x12)
                throw new OFParseError("Wrong type: Expected=0x12(0x12), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 6)
                throw new OFParseError("Wrong length: Expected=6(6), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            int value = U16.f(bb.readShort());

            OFBsnTlvUdfLengthVer13 bsnTlvUdfLengthVer13 = new OFBsnTlvUdfLengthVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvUdfLengthVer13);
            return bsnTlvUdfLengthVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvUdfLengthVer13Funnel FUNNEL = new OFBsnTlvUdfLengthVer13Funnel();
    static class OFBsnTlvUdfLengthVer13Funnel implements Funnel<OFBsnTlvUdfLengthVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvUdfLengthVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x12
            sink.putShort((short) 0x12);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            sink.putInt(message.value);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvUdfLengthVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvUdfLengthVer13 message) {
            // fixed value property type = 0x12
            bb.writeShort((short) 0x12);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            bb.writeShort(U16.t(message.value));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvUdfLengthVer13(");
        b.append("value=").append(value);
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
        OFBsnTlvUdfLengthVer13 other = (OFBsnTlvUdfLengthVer13) obj;

        if( value != other.value)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + value;
        return result;
    }

}
