/*
 * Copyright (C) 2003 - 2012 OpenSubsystems.com/net/org and its owners. All rights reserved.
 * 
 * This file is part of OpenSubsystems.
 *
 * OpenSubsystems is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 */

package org.opensubsystems.statemachine.data;

import org.opensubsystems.core.data.ModifiableDataObject;

/**
 * Base interface for all data objects that can have a state that can be 
 * modified by a state machine.
 *
 * @author bastafidli
 */
public interface StatefulDataObject extends ModifiableDataObject
{
   // Logic ////////////////////////////////////////////////////////////////////

   /**
    * Get the current state of the stateful data object.
    *
    * @return String
    */
   String getCurrentState(
   );
   
   /**
    * Get the current state model that the stateful data object follows. The 
    * state model describes the set of states that the stateful data object can
    * have and the transitions between these states.
    *
    * @return String
    */
   String getStateModel(
   );
}
