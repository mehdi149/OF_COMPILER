package handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openflow.protocol.OFMatch;
import org.projectfloodlight.openflow.types.OFPort ;
import org.projectfloodlight.openflow.protocol.OFFactories;
import org.projectfloodlight.openflow.protocol.OFFactory;
import org.projectfloodlight.openflow.protocol.OFFlowAdd;
import org.projectfloodlight.openflow.protocol.OFVersion;
import org.projectfloodlight.openflow.protocol.instruction.OFInstruction;
import org.projectfloodlight.openflow.protocol.match.Match;
import org.projectfloodlight.openflow.protocol.match.Match.Builder;
import org.projectfloodlight.openflow.types.OFBufferId;
import org.projectfloodlight.openflow.types.TableId;

import struct.Application;
import struct.AttributeType;
import struct.Entry;
import struct.Lat_Attribute;
import struct.SubsetTable;
import struct.Table;



public class ApplicationHandler {
	private Application app;
	
	public ApplicationHandler(Application app){
		this.app = app;
		
	}
	public void deliver_pipeline_to_switch(){
		Map<Integer,Table> MapTable = this.app.getAppTable();
		Map<Integer,SubsetTable> MapSubTab = this.app.getSubSetTable();
		int[][] tableChaining= this.app.TableChaining;
		//System.out.println(MapTable);
		//System.out.println(MapSubTab);
		for (int i=0 ; i<MapTable.size();i++){
			 Table table = MapTable.get(i);
			 int id_table = table.id;
		     AttributeType MatchField = table.matchField;
			 ArrayList<Entry> entries = table.entry;
			 
			 /*
			  *  Install miss flow entry to table id: id_table
			  *  send entry flow mod to table id:id_table
			 */
			OFFactory my13Factory = OFFactories.getFactory(OFVersion.OF_13);
            Match myMatch = my13Factory.buildMatch().build();
		    List<OFInstruction> myInstructionList = new ArrayList<OFInstruction>();
	        OFFlowAdd flowAdd = my13Factory.buildFlowAdd()
                     .setBufferId(OFBufferId.NO_BUFFER)
                     .setMatch(myMatch)
                     .setInstructions(myInstructionList)
                     .setOutPort(OFPort.FLOOD)
                     .setTableId(TableId.of(id_table))
                   .build();
	        
	        
			for (int j=0 ; j< entries.size();j++){
				Entry  entry= entries.get(j);
				String lat_attribute = entry.matchfield.toString(); 
				// parse matchfield and create Ofmatch
				String Field = Arrays.asList(lat_attribute.split("\\=")).get(0);
				Field = Field.replace("[", "");
				String Value = Arrays.asList(lat_attribute.split("\\=")).get(1);
				Value = Value.replace("]","");
				System.out.println(Field);
				System.out.println(Value);
			
				Builder match = my13Factory.buildMatch();
				switch(Field){
				case "EtherType":
					break;
				case "EtherSrc":
					break;
				case "EtherDst":
					break;
				case  "PortDst":
					break;
				case "PortSrc":
					break;
				case  "IpDst":
					break;
				case "IpSrc":
					break;
				case "IngressPort":
					break;
				case "IngressVPort":
					break;
				case "VlanId":
					break;
				
				}
				
				
			}
			
		}

		
	}
	
	

}
