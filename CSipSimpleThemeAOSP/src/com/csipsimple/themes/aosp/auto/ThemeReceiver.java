/**
 * Copyright (C) 2010 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimpleThemeAOSP.
 *
 *  CSipSimpleThemeAOSP is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CSipSimpleThemeAOSP is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CSipSimpleThemeAOSP.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.csipsimple.themes.aosp.auto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ThemeReceiver extends BroadcastReceiver {

	public static final String ACTION_GET_DRAWABLES = "com.csipsimple.themes.GET_DRAWABLES";
	
	
	@Override
	public void onReceive(Context ctxt, Intent intent) {
		
		if(ACTION_GET_DRAWABLES.equalsIgnoreCase(intent.getAction())) {
			Bundle results = getResultExtras(true);
			
			//Dialer
			results.putString("btn_dial_normal", "com.android.phone:drawable/btn_dial_normal");
			results.putString("btn_dial_pressed", "com.android.phone:drawable/btn_dial_pressed");
			results.putString("btn_dial_selected", "com.android.phone:drawable/btn_dial_selected");
			results.putString("btn_dial_delete", "com.android.phone:drawable/btn_dial_delete");
			results.putString("btn_dial_action", "com.android.phone:drawable/btn_dial_action");
			results.putString("btn_dial_action_left_normal", "com.android.phone:drawable/btn_dial_action_left_normal");
	//		results.putString("btn_dial_textfield_normal", "com.android.phone:drawable/btn_dial_textfield_normal");
	//		results.putString("btn_dial_textfield_active", "com.android.phone:drawable/btn_dial_textfield_active");
			
			//In call
			// TG ON
			results.putString("btn_in_call_switch_on_normal", "com.android.phone:drawable/btn_in_call_switch_on_normal");
			results.putString("btn_in_call_switch_on_disable", "com.android.phone:drawable/btn_in_call_switch_on_disable");
			results.putString("btn_in_call_switch_on_pressed", "com.android.phone:drawable/btn_in_call_switch_on_pressed");
			results.putString("btn_in_call_switch_on_selected", "com.android.phone:drawable/btn_in_call_switch_on_selected");
			results.putString("btn_in_call_switch_on_disable_focused", "com.android.phone:drawable/btn_in_call_switch_on_disable_focused");
			// TG OFF
			results.putString("btn_in_call_switch_off_normal", "com.android.phone:drawable/btn_in_call_switch_off_normal");
			results.putString("btn_in_call_switch_off_disable", "com.android.phone:drawable/btn_in_call_switch_off_disable");
			results.putString("btn_in_call_switch_off_pressed", "com.android.phone:drawable/btn_in_call_switch_off_pressed");
			results.putString("btn_in_call_switch_off_selected", "com.android.phone:drawable/btn_in_call_switch_off_selected");
			results.putString("btn_in_call_switch_off_disable_focused", "com.android.phone:drawable/btn_in_call_switch_off_disable_focused");

			// Buttons
			results.putString("btn_in_call_main_normal", "com.android.phone:drawable/btn_in_call_main_normal");
			results.putString("btn_in_call_main_disable", "com.android.phone:drawable/btn_in_call_main_disable");
			results.putString("btn_in_call_main_pressed", "com.android.phone:drawable/btn_in_call_main_pressed");
			results.putString("btn_in_call_main_selected", "com.android.phone:drawable/btn_in_call_main_selected");
			results.putString("btn_in_call_main_disable_focused", "com.android.phone:drawable/btn_in_call_main_disable_focused");
			
			// Buttons Drawables top
			results.putString("ic_in_call_touch_add_call", "com.android.phone:drawable/ic_in_call_touch_add_call");
			results.putString("ic_in_call_touch_end", "com.android.phone:drawable/ic_in_call_touch_end");
			results.putString("ic_in_call_touch_dialpad", "com.android.phone:drawable/ic_in_call_touch_dialpad");
			
			// Jog slider
			results.putString("ic_jog_dial_answer", "com.android.phone:drawable/ic_jog_dial_answer");
			results.putString("jog_tab_target_green", "android:drawable/jog_tab_target_green");
			results.putString("jog_tab_bar_left_answer", "android:drawable/jog_tab_bar_left_answer");
			results.putString("jog_tab_left_answer", "android:drawable/jog_tab_left_answer");

			results.putString("ic_jog_dial_decline", "com.android.phone:drawable/ic_jog_dial_decline");
			results.putString("jog_tab_target_red", "android:drawable/jog_tab_target_red");
			results.putString("jog_tab_bar_right_decline", "android:drawable/jog_tab_bar_right_decline");
			results.putString("jog_tab_right_decline", "android:drawable/jog_tab_right_decline");
			
			
		}
	}

}
