package me.daydayup.beesite.modules.blog.utils.backup;

import java.util.ArrayList;
/**
 * @author mooejun
 * @since 2019/4/28
 */
public class FKCollection extends ArrayList<FK>{

	private static final long serialVersionUID = -972085209611643212L;
	
	public boolean isReferenced(Table referenceTable){
		 for(FK fk : this){
			 if(fk.getReferenceTable().equals(referenceTable)){
				 return true;
			 }
		 }
		 return false;
	}
}
