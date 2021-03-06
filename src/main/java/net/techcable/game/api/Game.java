/**
 * This file is part of gameapi.
 *
 * gameapi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * gameapi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with gameapi.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.techcable.game.api;

/**
 * The abstract class all minigames extend from
 * 
 * @author Techcable
 */
public abstract class Game {
    
    /**
     * Return the name of this minigame
     * 
     * @return the name of this minigame
     */
    public abstract String getName();
    
}