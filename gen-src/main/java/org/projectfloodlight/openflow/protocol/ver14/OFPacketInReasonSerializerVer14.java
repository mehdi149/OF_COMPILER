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
import org.projectfloodlight.openflow.protocol.OFPacketInReason;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFPacketInReasonSerializerVer14 {

    public final static byte NO_MATCH_VAL = (byte) 0x0;
    public final static byte ACTION_VAL = (byte) 0x1;
    public final static byte INVALID_TTL_VAL = (byte) 0x2;
    public final static byte ACTION_SET_VAL = (byte) 0x3;
    public final static byte GROUP_VAL = (byte) 0x4;
    public final static byte PACKET_OUT_VAL = (byte) 0x5;
    public final static byte BSN_NEW_HOST_VAL = (byte) 0x80;
    public final static byte BSN_STATION_MOVE_VAL = (byte) 0x81;
    public final static byte BSN_BAD_VLAN_VAL = (byte) 0x82;
    public final static byte BSN_DESTINATION_LOOKUP_FAILURE_VAL = (byte) 0x83;
    public final static byte BSN_NO_ROUTE_VAL = (byte) 0x84;
    public final static byte BSN_ICMP_ECHO_REQUEST_VAL = (byte) 0x85;
    public final static byte BSN_DEST_NETWORK_UNREACHABLE_VAL = (byte) 0x86;
    public final static byte BSN_DEST_HOST_UNREACHABLE_VAL = (byte) 0x87;
    public final static byte BSN_DEST_PORT_UNREACHABLE_VAL = (byte) 0x88;
    public final static byte BSN_FRAGMENTATION_REQUIRED_VAL = (byte) 0x89;
    public final static byte BSN_ARP_VAL = (byte) 0x8b;
    public final static byte BSN_DHCP_VAL = (byte) 0x8c;
    public final static byte BSN_DEBUG_VAL = (byte) 0x8d;
    public final static byte BSN_PACKET_OF_DEATH_VAL = (byte) 0x8e;

    public static OFPacketInReason readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFPacketInReason e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFPacketInReason e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFPacketInReason ofWireValue(byte val) {
        switch(val) {
            case NO_MATCH_VAL:
                return OFPacketInReason.NO_MATCH;
            case ACTION_VAL:
                return OFPacketInReason.ACTION;
            case INVALID_TTL_VAL:
                return OFPacketInReason.INVALID_TTL;
            case ACTION_SET_VAL:
                return OFPacketInReason.ACTION_SET;
            case GROUP_VAL:
                return OFPacketInReason.GROUP;
            case PACKET_OUT_VAL:
                return OFPacketInReason.PACKET_OUT;
            case BSN_NEW_HOST_VAL:
                return OFPacketInReason.BSN_NEW_HOST;
            case BSN_STATION_MOVE_VAL:
                return OFPacketInReason.BSN_STATION_MOVE;
            case BSN_BAD_VLAN_VAL:
                return OFPacketInReason.BSN_BAD_VLAN;
            case BSN_DESTINATION_LOOKUP_FAILURE_VAL:
                return OFPacketInReason.BSN_DESTINATION_LOOKUP_FAILURE;
            case BSN_NO_ROUTE_VAL:
                return OFPacketInReason.BSN_NO_ROUTE;
            case BSN_ICMP_ECHO_REQUEST_VAL:
                return OFPacketInReason.BSN_ICMP_ECHO_REQUEST;
            case BSN_DEST_NETWORK_UNREACHABLE_VAL:
                return OFPacketInReason.BSN_DEST_NETWORK_UNREACHABLE;
            case BSN_DEST_HOST_UNREACHABLE_VAL:
                return OFPacketInReason.BSN_DEST_HOST_UNREACHABLE;
            case BSN_DEST_PORT_UNREACHABLE_VAL:
                return OFPacketInReason.BSN_DEST_PORT_UNREACHABLE;
            case BSN_FRAGMENTATION_REQUIRED_VAL:
                return OFPacketInReason.BSN_FRAGMENTATION_REQUIRED;
            case BSN_ARP_VAL:
                return OFPacketInReason.BSN_ARP;
            case BSN_DHCP_VAL:
                return OFPacketInReason.BSN_DHCP;
            case BSN_DEBUG_VAL:
                return OFPacketInReason.BSN_DEBUG;
            case BSN_PACKET_OF_DEATH_VAL:
                return OFPacketInReason.BSN_PACKET_OF_DEATH;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFPacketInReason in version 1.4: " + val);
        }
    }


    public static byte toWireValue(OFPacketInReason e) {
        switch(e) {
            case NO_MATCH:
                return NO_MATCH_VAL;
            case ACTION:
                return ACTION_VAL;
            case INVALID_TTL:
                return INVALID_TTL_VAL;
            case ACTION_SET:
                return ACTION_SET_VAL;
            case GROUP:
                return GROUP_VAL;
            case PACKET_OUT:
                return PACKET_OUT_VAL;
            case BSN_NEW_HOST:
                return BSN_NEW_HOST_VAL;
            case BSN_STATION_MOVE:
                return BSN_STATION_MOVE_VAL;
            case BSN_BAD_VLAN:
                return BSN_BAD_VLAN_VAL;
            case BSN_DESTINATION_LOOKUP_FAILURE:
                return BSN_DESTINATION_LOOKUP_FAILURE_VAL;
            case BSN_NO_ROUTE:
                return BSN_NO_ROUTE_VAL;
            case BSN_ICMP_ECHO_REQUEST:
                return BSN_ICMP_ECHO_REQUEST_VAL;
            case BSN_DEST_NETWORK_UNREACHABLE:
                return BSN_DEST_NETWORK_UNREACHABLE_VAL;
            case BSN_DEST_HOST_UNREACHABLE:
                return BSN_DEST_HOST_UNREACHABLE_VAL;
            case BSN_DEST_PORT_UNREACHABLE:
                return BSN_DEST_PORT_UNREACHABLE_VAL;
            case BSN_FRAGMENTATION_REQUIRED:
                return BSN_FRAGMENTATION_REQUIRED_VAL;
            case BSN_ARP:
                return BSN_ARP_VAL;
            case BSN_DHCP:
                return BSN_DHCP_VAL;
            case BSN_DEBUG:
                return BSN_DEBUG_VAL;
            case BSN_PACKET_OF_DEATH:
                return BSN_PACKET_OF_DEATH_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFPacketInReason in version 1.4: " + e);
        }
    }

}
