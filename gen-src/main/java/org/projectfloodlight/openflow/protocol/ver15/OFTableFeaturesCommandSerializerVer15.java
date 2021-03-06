// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFTableFeaturesCommand;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFTableFeaturesCommandSerializerVer15 {

    public final static byte REPLACE_VAL = (byte) 0x0;
    public final static byte MODIFY_VAL = (byte) 0x1;
    public final static byte ENABLE_VAL = (byte) 0x2;
    public final static byte DISABLE_VAL = (byte) 0x3;

    public static OFTableFeaturesCommand readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFTableFeaturesCommand e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFTableFeaturesCommand e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFTableFeaturesCommand ofWireValue(byte val) {
        switch(val) {
            case REPLACE_VAL:
                return OFTableFeaturesCommand.REPLACE;
            case MODIFY_VAL:
                return OFTableFeaturesCommand.MODIFY;
            case ENABLE_VAL:
                return OFTableFeaturesCommand.ENABLE;
            case DISABLE_VAL:
                return OFTableFeaturesCommand.DISABLE;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFTableFeaturesCommand in version 1.5: " + val);
        }
    }


    public static byte toWireValue(OFTableFeaturesCommand e) {
        switch(e) {
            case REPLACE:
                return REPLACE_VAL;
            case MODIFY:
                return MODIFY_VAL;
            case ENABLE:
                return ENABLE_VAL;
            case DISABLE:
                return DISABLE_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFTableFeaturesCommand in version 1.5: " + e);
        }
    }

}
