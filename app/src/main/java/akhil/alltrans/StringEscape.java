/*
 * Copyright 2017 Akhil Kedia
 * This file is part of AllTrans.
 *
 * AllTrans is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AllTrans is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AllTrans. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package akhil.alltrans;

class StringEscape {
    public static String XMLUnescape(String s) {
        String retVal = s.replaceAll("&amp;", "&");
        retVal = retVal.replaceAll("&quot;", "\"");
        retVal = retVal.replaceAll("&apos;", "'");
        retVal = retVal.replaceAll("&lt;", "<");
        retVal = retVal.replaceAll("&gt;", ">");
        retVal = retVal.replaceAll("&#xD;", "\r");
        retVal = retVal.replaceAll("&#xA;", "\n");

        retVal = retVal.replaceAll("&amp;", "&");
        retVal = retVal.replaceAll("&quot;", "\"");
        retVal = retVal.replaceAll("&apos;", "'");
        retVal = retVal.replaceAll("&lt;", "<");
        retVal = retVal.replaceAll("&gt;", ">");
        retVal = retVal.replaceAll("&#xD;", "\r");
        retVal = retVal.replaceAll("&#xA;", "\n");
        return retVal;
    }
}
