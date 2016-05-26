// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBsnControllerRoleReason;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFBsnControllerRoleReasonSerializerVer13 {

    public final static byte BSN_CONTROLLER_ROLE_REASON_MASTER_REQUEST_VAL = (byte) 0x0;
    public final static byte BSN_CONTROLLER_ROLE_REASON_CONFIG_VAL = (byte) 0x1;
    public final static byte BSN_CONTROLLER_ROLE_REASON_EXPERIMENTER_VAL = (byte) 0x2;

    public static OFBsnControllerRoleReason readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBsnControllerRoleReason e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFBsnControllerRoleReason e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFBsnControllerRoleReason ofWireValue(byte val) {
        switch(val) {
            case BSN_CONTROLLER_ROLE_REASON_MASTER_REQUEST_VAL:
                return OFBsnControllerRoleReason.BSN_CONTROLLER_ROLE_REASON_MASTER_REQUEST;
            case BSN_CONTROLLER_ROLE_REASON_CONFIG_VAL:
                return OFBsnControllerRoleReason.BSN_CONTROLLER_ROLE_REASON_CONFIG;
            case BSN_CONTROLLER_ROLE_REASON_EXPERIMENTER_VAL:
                return OFBsnControllerRoleReason.BSN_CONTROLLER_ROLE_REASON_EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnControllerRoleReason in version 1.3: " + val);
        }
    }


    public static byte toWireValue(OFBsnControllerRoleReason e) {
        switch(e) {
            case BSN_CONTROLLER_ROLE_REASON_MASTER_REQUEST:
                return BSN_CONTROLLER_ROLE_REASON_MASTER_REQUEST_VAL;
            case BSN_CONTROLLER_ROLE_REASON_CONFIG:
                return BSN_CONTROLLER_ROLE_REASON_CONFIG_VAL;
            case BSN_CONTROLLER_ROLE_REASON_EXPERIMENTER:
                return BSN_CONTROLLER_ROLE_REASON_EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnControllerRoleReason in version 1.3: " + e);
        }
    }

}