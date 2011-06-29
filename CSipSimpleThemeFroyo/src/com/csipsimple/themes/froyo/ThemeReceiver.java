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
package com.csipsimple.themes.froyo;

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
			results.putString("btn_dial_normal", "com.csipsimple.themes.froyo:drawable/btn_dial_normal");
			results.putString("btn_dial_pressed", "com.csipsimple.themes.froyo:drawable/btn_dial_pressed");
			results.putString("btn_dial_selected", "com.csipsimple.themes.froyo:drawable/btn_dial_selected");
			results.putString("btn_dial_delete", "com.csipsimple.themes.froyo:drawable/btn_dial_delete");
			results.putString("btn_dial_action", "com.csipsimple.themes.froyo:drawable/btn_dial_action");
			results.putString("btn_dial_action_left_normal", "com.csipsimple.themes.froyo:drawable/btn_dial_action_left_normal");
			results.putString("btn_dial_textfield_normal", "com.csipsimple.themes.froyo:drawable/btn_dial_textfield_normal");
			results.putString("btn_dial_textfield_activated", "com.csipsimple.themes.froyo:drawable/btn_dial_textfield_activated");
			results.putString("btn_dial_textfield_pressed", "com.csipsimple.themes.froyo:drawable/btn_dial_textfield_pressed");
			
			//In call
			// TG ON
			results.putString("btn_in_call_switch_on_normal", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_on_normal");
			results.putString("btn_in_call_switch_on_disable", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_on_disable");
			results.putString("btn_in_call_switch_on_pressed", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_on_pressed");
			results.putString("btn_in_call_switch_on_selected", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_on_selected");
			results.putString("btn_in_call_switch_on_disable_focused", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_on_disable_focused");
			// TG OFF
			results.putString("btn_in_call_switch_off_normal", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_off_normal");
			results.putString("btn_in_call_switch_off_disable", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_off_disable");
			results.putString("btn_in_call_switch_off_pressed", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_off_pressed");
			results.putString("btn_in_call_switch_off_selected", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_off_selected");
			results.putString("btn_in_call_switch_off_disable_focused", "com.csipsimple.themes.froyo:drawable/btn_in_call_switch_off_disable_focused");

			// Buttons
			results.putString("btn_in_call_main_normal", "com.csipsimple.themes.froyo:drawable/btn_in_call_main_normal");
			results.putString("btn_in_call_main_disable", "com.csipsimple.themes.froyo:drawable/btn_in_call_main_disable");
			results.putString("btn_in_call_main_pressed", "com.csipsimple.themes.froyo:drawable/btn_in_call_main_pressed");
			results.putString("btn_in_call_main_selected", "com.csipsimple.themes.froyo:drawable/btn_in_call_main_selected");
			results.putString("btn_in_call_main_disable_focused", "com.csipsimple.themes.froyo:drawable/btn_in_call_main_disable_focused");
			
			// Buttons Drawables top
			results.putString("ic_in_call_touch_add_call", "com.csipsimple.themes.froyo:drawable/ic_in_call_touch_add_call");
			results.putString("ic_in_call_touch_end", "com.csipsimple.themes.froyo:drawable/ic_in_call_touch_end");
			results.putString("ic_in_call_touch_dialpad", "com.csipsimple.themes.froyo:drawable/ic_in_call_touch_dialpad");
			
			// Jog slider
			results.putString("ic_jog_dial_answer", "com.csipsimple.themes.froyo:drawable/ic_jog_dial_answer");
			results.putString("jog_tab_target_green", "com.csipsimple.themes.froyo:drawable/jog_tab_target_green");
			results.putString("jog_tab_bar_left_answer", "com.csipsimple.themes.froyo:drawable/jog_tab_bar_left_answer");
			results.putString("jog_tab_left_answer", "com.csipsimple.themes.froyo:drawable/jog_tab_left_answer");

			results.putString("ic_jog_dial_decline", "com.csipsimple.themes.froyo:drawable/ic_jog_dial_decline");
			results.putString("jog_tab_target_red", "com.csipsimple.themes.froyo:drawable/jog_tab_target_red");
			results.putString("jog_tab_bar_right_decline", "com.csipsimple.themes.froyo:drawable/jog_tab_bar_right_decline");
			results.putString("jog_tab_right_decline", "com.csipsimple.themes.froyo:drawable/jog_tab_right_decline");
			
			
		}
	}

}
