// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
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
import java.util.List;
import java.util.Set;


public class OFInstructionsVer15 implements OFInstructions {
    public final static OFInstructionsVer15 INSTANCE = new OFInstructionsVer15();




    public OFInstructionApplyActions.Builder buildApplyActions() {
        return new OFInstructionApplyActionsVer15.Builder();
    }
    public OFInstructionApplyActions applyActions(List<OFAction> actions) {
        return new OFInstructionApplyActionsVer15(
                actions
                    );
    }

    public OFInstructionClearActions clearActions() {
        return OFInstructionClearActionsVer15.INSTANCE;
    }

    public OFInstructionGotoTable.Builder buildGotoTable() {
        return new OFInstructionGotoTableVer15.Builder();
    }
    public OFInstructionGotoTable gotoTable(TableId tableId) {
        return new OFInstructionGotoTableVer15(
                tableId
                    );
    }

    public OFInstructionWriteActions.Builder buildWriteActions() {
        return new OFInstructionWriteActionsVer15.Builder();
    }
    public OFInstructionWriteActions writeActions(List<OFAction> actions) {
        return new OFInstructionWriteActionsVer15(
                actions
                    );
    }

    public OFInstructionWriteMetadata.Builder buildWriteMetadata() {
        return new OFInstructionWriteMetadataVer15.Builder();
    }
    public OFInstructionWriteMetadata writeMetadata(U64 metadata, U64 metadataMask) {
        return new OFInstructionWriteMetadataVer15(
                metadata,
                      metadataMask
                    );
    }

    public OFInstructionBsnArpOffload bsnArpOffload() {
        return OFInstructionBsnArpOffloadVer15.INSTANCE;
    }

    public OFInstructionBsnAutoNegotiation bsnAutoNegotiation() {
        return OFInstructionBsnAutoNegotiationVer15.INSTANCE;
    }

    public OFInstructionBsnDeny bsnDeny() {
        return OFInstructionBsnDenyVer15.INSTANCE;
    }

    public OFInstructionBsnDhcpOffload bsnDhcpOffload() {
        return OFInstructionBsnDhcpOffloadVer15.INSTANCE;
    }

    public OFInstructionBsnDisableL3 bsnDisableL3() {
        return OFInstructionBsnDisableL3Ver15.INSTANCE;
    }

    public OFInstructionBsnDisableSplitHorizonCheck bsnDisableSplitHorizonCheck() {
        throw new UnsupportedOperationException("OFInstructionBsnDisableSplitHorizonCheck not supported in version 1.5");
    }

    public OFInstructionBsnDisableSrcMacCheck bsnDisableSrcMacCheck() {
        return OFInstructionBsnDisableSrcMacCheckVer15.INSTANCE;
    }

    public OFInstructionBsnDisableVlanCounters bsnDisableVlanCounters() {
        return OFInstructionBsnDisableVlanCountersVer15.INSTANCE;
    }

    public OFInstructionBsnInternalPriority.Builder buildBsnInternalPriority() {
        return new OFInstructionBsnInternalPriorityVer15.Builder();
    }
    public OFInstructionBsnInternalPriority bsnInternalPriority(long value) {
        return new OFInstructionBsnInternalPriorityVer15(
                value
                    );
    }

    public OFInstructionBsnPacketOfDeath bsnPacketOfDeath() {
        return OFInstructionBsnPacketOfDeathVer15.INSTANCE;
    }

    public OFInstructionBsnPermit bsnPermit() {
        return OFInstructionBsnPermitVer15.INSTANCE;
    }

    public OFInstructionBsnPrioritizePdus bsnPrioritizePdus() {
        return OFInstructionBsnPrioritizePdusVer15.INSTANCE;
    }

    public OFInstructionBsnRequireVlanXlate bsnRequireVlanXlate() {
        return OFInstructionBsnRequireVlanXlateVer15.INSTANCE;
    }

    public OFInstructionBsnSpanDestination bsnSpanDestination() {
        return OFInstructionBsnSpanDestinationVer15.INSTANCE;
    }

    public OFInstructionMeter.Builder buildMeter() {
        throw new UnsupportedOperationException("OFInstructionMeter not supported in version 1.5");
    }
    public OFInstructionMeter meter(long meterId) {
        throw new UnsupportedOperationException("OFInstructionMeter not supported in version 1.5");
    }

    public OFInstructionStatTrigger.Builder buildStatTrigger() {
        return new OFInstructionStatTriggerVer15.Builder();
    }
    public OFInstructionStatTrigger statTrigger(Set<OFStatTriggerFlags> flags, OFOxsList thresholds) {
        return new OFInstructionStatTriggerVer15(
                flags,
                      thresholds
                    );
    }

    public OFMessageReader<OFInstruction> getReader() {
        return OFInstructionVer15.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_15;
    }
}
