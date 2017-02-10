/**
 * 
 */
package com.anthem.oss.nimbus.test.sample.um.model.view;


import com.anthem.nimbus.platform.spec.model.dsl.MapsTo;
import com.anthem.nimbus.platform.spec.model.dsl.MapsTo.Path;
import com.anthem.nimbus.platform.spec.model.view.ViewConfig.Button;
import com.anthem.nimbus.platform.spec.model.view.ViewConfig.Hints;
import com.anthem.nimbus.platform.spec.model.view.ViewConfig.Hints.AlignOptions;
import com.anthem.oss.nimbus.test.sample.um.model.Patient;
import com.anthem.oss.nimbus.test.sample.um.model.UMCase;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Soham Chakravarti
 *
 */
@MapsTo.Type(UMCase.class)
@Getter @Setter
public class Page_PatientDetails {

	
	
	@MapsTo.Type(Patient.class)
	@Getter @Setter
	public static class Section_PatientDetailsDisplay {

		@Path private String subscriberId;

		@Path private String firstName;

		@Path private String lastName;
		
		//@MapsTo.Path("../provider/id")
		//private Object providerId;
    }

	//@Summary @Mode(Mode.Options.ReadOnly) @MapsTo.Path("/patient")
	//private Section_PatientDetailsDisplay existingPatient;
	
	/*	*/

	
	
	//@Summary @Mode(Mode.Options.ReadOnly) //@MapsTo.Path("/patient")
	//@Path(linked=false) private transient Section_PatientDetailsDisplay searchedPatient;

	@Button(url="/_nav?a=back") @Hints(align=AlignOptions.Left)
	private String back_FindPatient;

	@Button(url="/_nav?a=next") @Hints(align=AlignOptions.Right)
	private String action_ConfirmPatient;
	
}