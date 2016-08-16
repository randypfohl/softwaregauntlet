/*Copyright 2015 Craig A. Stockton

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.*/
package com.author_it.gauntlet;

import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.validator4test.Validator;

public abstract class ExpectedResult {
    protected abstract <T extends Validator> T instantiateValidator(Object actual);

    public String validate(Object actual) {
        UiRegion.suppressConstructionLogging(true);
        String result = instantiateValidator(actual).validate();
        UiRegion.suppressConstructionLogging(false);
        return result;
    }
}
