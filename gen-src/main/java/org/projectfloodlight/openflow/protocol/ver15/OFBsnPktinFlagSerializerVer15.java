// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBsnPktinFlag;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFBsnPktinFlagSerializerVer15 {

    public final static long BSN_PKTIN_FLAG_PDU_VAL = 0x1L;
    public final static long BSN_PKTIN_FLAG_NEW_HOST_VAL = 0x2L;
    public final static long BSN_PKTIN_FLAG_STATION_MOVE_VAL = 0x4L;
    public final static long BSN_PKTIN_FLAG_ARP_VAL = 0x8L;
    public final static long BSN_PKTIN_FLAG_DHCP_VAL = 0x10L;
    public final static long BSN_PKTIN_FLAG_L2_CPU_VAL = 0x20L;
    public final static long BSN_PKTIN_FLAG_DEBUG_VAL = 0x40L;
    public final static long BSN_PKTIN_FLAG_TTL_EXPIRED_VAL = 0x80L;
    public final static long BSN_PKTIN_FLAG_L3_MISS_VAL = 0x100L;
    public final static long BSN_PKTIN_FLAG_L3_CPU_VAL = 0x200L;
    public final static long BSN_PKTIN_FLAG_INGRESS_ACL_VAL = 0x400L;
    public final static long BSN_PKTIN_FLAG_SFLOW_VAL = 0x800L;
    public final static long BSN_PKTIN_FLAG_ARP_CACHE_VAL = 0x1000L;
    public final static long BSN_PKTIN_FLAG_ARP_TARGET_VAL = 0x2000L;
    public final static long BSN_PKTIN_FLAG_IGMP_VAL = 0x4000L;
    public final static long BSN_PKTIN_FLAG_PIM_VAL = 0x8000L;
    public final static long BSN_PKTIN_FLAG_VXLAN_SIP_MISS_VAL = 0x10000L;
    public final static long BSN_PKTIN_FLAG_MC_RESERVED_VAL = 0x20000L;

    public static Set<OFBsnPktinFlag> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readLong());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFBsnPktinFlag> set) {
        bb.writeLong(toWireValue(set));
    }

    public static void putTo(Set<OFBsnPktinFlag> set, PrimitiveSink sink) {
        sink.putLong(toWireValue(set));
    }


    public static Set<OFBsnPktinFlag> ofWireValue(long val) {
        EnumSet<OFBsnPktinFlag> set = EnumSet.noneOf(OFBsnPktinFlag.class);

        if((val & BSN_PKTIN_FLAG_PDU_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_PDU);
        if((val & BSN_PKTIN_FLAG_NEW_HOST_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_NEW_HOST);
        if((val & BSN_PKTIN_FLAG_STATION_MOVE_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_STATION_MOVE);
        if((val & BSN_PKTIN_FLAG_ARP_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_ARP);
        if((val & BSN_PKTIN_FLAG_DHCP_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_DHCP);
        if((val & BSN_PKTIN_FLAG_L2_CPU_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_L2_CPU);
        if((val & BSN_PKTIN_FLAG_DEBUG_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_DEBUG);
        if((val & BSN_PKTIN_FLAG_TTL_EXPIRED_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_TTL_EXPIRED);
        if((val & BSN_PKTIN_FLAG_L3_MISS_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_L3_MISS);
        if((val & BSN_PKTIN_FLAG_L3_CPU_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_L3_CPU);
        if((val & BSN_PKTIN_FLAG_INGRESS_ACL_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_INGRESS_ACL);
        if((val & BSN_PKTIN_FLAG_SFLOW_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_SFLOW);
        if((val & BSN_PKTIN_FLAG_ARP_CACHE_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_ARP_CACHE);
        if((val & BSN_PKTIN_FLAG_ARP_TARGET_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_ARP_TARGET);
        if((val & BSN_PKTIN_FLAG_IGMP_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_IGMP);
        if((val & BSN_PKTIN_FLAG_PIM_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_PIM);
        if((val & BSN_PKTIN_FLAG_VXLAN_SIP_MISS_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_VXLAN_SIP_MISS);
        if((val & BSN_PKTIN_FLAG_MC_RESERVED_VAL) != 0)
            set.add(OFBsnPktinFlag.BSN_PKTIN_FLAG_MC_RESERVED);
        return Collections.unmodifiableSet(set);
    }

    public static long toWireValue(Set<OFBsnPktinFlag> set) {
        long wireValue = 0;

        for(OFBsnPktinFlag e: set) {
            switch(e) {
                case BSN_PKTIN_FLAG_PDU:
                    wireValue |= BSN_PKTIN_FLAG_PDU_VAL;
                    break;
                case BSN_PKTIN_FLAG_NEW_HOST:
                    wireValue |= BSN_PKTIN_FLAG_NEW_HOST_VAL;
                    break;
                case BSN_PKTIN_FLAG_STATION_MOVE:
                    wireValue |= BSN_PKTIN_FLAG_STATION_MOVE_VAL;
                    break;
                case BSN_PKTIN_FLAG_ARP:
                    wireValue |= BSN_PKTIN_FLAG_ARP_VAL;
                    break;
                case BSN_PKTIN_FLAG_DHCP:
                    wireValue |= BSN_PKTIN_FLAG_DHCP_VAL;
                    break;
                case BSN_PKTIN_FLAG_L2_CPU:
                    wireValue |= BSN_PKTIN_FLAG_L2_CPU_VAL;
                    break;
                case BSN_PKTIN_FLAG_DEBUG:
                    wireValue |= BSN_PKTIN_FLAG_DEBUG_VAL;
                    break;
                case BSN_PKTIN_FLAG_TTL_EXPIRED:
                    wireValue |= BSN_PKTIN_FLAG_TTL_EXPIRED_VAL;
                    break;
                case BSN_PKTIN_FLAG_L3_MISS:
                    wireValue |= BSN_PKTIN_FLAG_L3_MISS_VAL;
                    break;
                case BSN_PKTIN_FLAG_L3_CPU:
                    wireValue |= BSN_PKTIN_FLAG_L3_CPU_VAL;
                    break;
                case BSN_PKTIN_FLAG_INGRESS_ACL:
                    wireValue |= BSN_PKTIN_FLAG_INGRESS_ACL_VAL;
                    break;
                case BSN_PKTIN_FLAG_SFLOW:
                    wireValue |= BSN_PKTIN_FLAG_SFLOW_VAL;
                    break;
                case BSN_PKTIN_FLAG_ARP_CACHE:
                    wireValue |= BSN_PKTIN_FLAG_ARP_CACHE_VAL;
                    break;
                case BSN_PKTIN_FLAG_ARP_TARGET:
                    wireValue |= BSN_PKTIN_FLAG_ARP_TARGET_VAL;
                    break;
                case BSN_PKTIN_FLAG_IGMP:
                    wireValue |= BSN_PKTIN_FLAG_IGMP_VAL;
                    break;
                case BSN_PKTIN_FLAG_PIM:
                    wireValue |= BSN_PKTIN_FLAG_PIM_VAL;
                    break;
                case BSN_PKTIN_FLAG_VXLAN_SIP_MISS:
                    wireValue |= BSN_PKTIN_FLAG_VXLAN_SIP_MISS_VAL;
                    break;
                case BSN_PKTIN_FLAG_MC_RESERVED:
                    wireValue |= BSN_PKTIN_FLAG_MC_RESERVED_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFBsnPktinFlag in version 1.5: " + e);
            }
        }
        return wireValue;
    }

}
