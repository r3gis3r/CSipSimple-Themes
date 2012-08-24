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

public class ThemeReceiver extends BroadcastReceiver {

	public static final String ACTION_GET_DRAWABLES = "com.csipsimple.themes.GET_DRAWABLES";
	
	
	@Override
	public void onReceive(Context ctxt, Intent intent) {
		
		if(ACTION_GET_DRAWABLES.equalsIgnoreCase(intent.getAction())) {
			
			
		}
	}

}
