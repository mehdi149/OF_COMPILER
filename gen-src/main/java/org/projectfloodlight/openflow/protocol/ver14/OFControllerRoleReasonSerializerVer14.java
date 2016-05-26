// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFControllerRoleReason;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFControllerRoleReasonSerializerVer14 {

    public final static byte MASTER_REQUEST_VAL = (byte) 0x0;
    public final static byte CONFIG_VAL = (byte) 0x1;
    public final static byte EXPERIMENTER_VAL = (byte) 0x2;

    public static OFControllerRoleReason readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFControllerRoleReason e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFControllerRoleReason e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFControllerRoleReason ofWireValue(byte val) {
        switch(val) {
            case MASTER_REQUEST_VAL:
                return OFControllerRoleReason.MASTER_REQUEST;
            case CONFIG_VAL:
                return OFControllerRoleReason.CONFIG;
            case EXPERIMENTER_VAL:
                return OFControllerRoleReason.EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFControllerRoleReason in version 1.4: " + val);
        }
    }


    public static byte toWireValue(OFControllerRoleReason e) {
        switch(e) {
            case MASTER_REQUEST:
                return MASTER_REQUEST_VAL;
            case CONFIG:
                return CONFIG_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFControllerRoleReason in version 1.4: " + e);
        }
    }

}
