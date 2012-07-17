/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.data.blocks.definitions

/**
 * A diatom is an organism. When diatoms die, their silica shells accumulate on the floor of the body of water in
 * which they lived. Thick layers of these diatom shells have been fossilized (that is, preserved) in the rock record.
 * Such layers, or beds, of diatoms are called diatomaceous earth, or diatomite. It is very porous which makes it
 * useful in a number of filtering applications.
 *
 * Because of its porosity, diatomite has been used extensively as a filter for a variety of purposes. It is used to
 * filter impurities out of everything from beer and wine to oils and greases. Similarly, diatomite is used to filter
 * impurities from water to produce drinkable (potable) water in public water systems. In this situation, the diatomite
 * removes bacteria and protozoa.
 */
block {
    version = 1
    shape = "cube"



    physics {
        mass = 128000
    }
}