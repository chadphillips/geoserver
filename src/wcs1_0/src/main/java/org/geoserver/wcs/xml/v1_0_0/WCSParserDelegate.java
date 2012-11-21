/* Copyright (c) 2001 - 2012 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, availible at the root
 * application directory.
 */
package org.geoserver.wcs.xml.v1_0_0;

import org.geotools.wcs.WCSConfiguration;
import org.geotools.xml.XSDParserDelegate;

/**
 * Parser delegate for WCS 1.0.0.
 * 
 * @author Chad Phillips 
 */
public class WCSParserDelegate extends XSDParserDelegate {
    public WCSParserDelegate() {
        super(new WCSConfiguration());
    }
}