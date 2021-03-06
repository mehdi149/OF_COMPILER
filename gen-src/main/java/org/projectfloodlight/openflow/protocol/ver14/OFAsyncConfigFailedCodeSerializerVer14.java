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
import org.projectfloodlight.openflow.protocol.OFAsyncConfigFailedCode;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFAsyncConfigFailedCodeSerializerVer14 {

    public final static short INVALID_VAL = (short) 0x0;
    public final static short UNSUPPORTED_VAL = (short) 0x1;
    public final static short EPERM_VAL = (short) 0x2;

    public static OFAsyncConfigFailedCode readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFAsyncConfigFailedCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFAsyncConfigFailedCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFAsyncConfigFailedCode ofWireValue(short val) {
        switch(val) {
            case INVALID_VAL:
                return OFAsyncConfigFailedCode.INVALID;
            case UNSUPPORTED_VAL:
                return OFAsyncConfigFailedCode.UNSUPPORTED;
            case EPERM_VAL:
                return OFAsyncConfigFailedCode.EPERM;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFAsyncConfigFailedCode in version 1.4: " + val);
        }
    }


    public static short toWireValue(OFAsyncConfigFailedCode e) {
        switch(e) {
            case INVALID:
                return INVALID_VAL;
            case UNSUPPORTED:
                return UNSUPPORTED_VAL;
            case EPERM:
                return EPERM_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFAsyncConfigFailedCode in version 1.4: " + e);
        }
    }

}
