/*
 * © Merative US L.P. 2016,2021
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.ibm.whc.deid.providers.identifiers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ibm.whc.deid.providers.masking.MaskingProviderTest;

public class RaceEthnicityIdentifierTest implements MaskingProviderTest {

  @Test
  public void testIsOfThisType() throws Exception {
    RaceEthnicityIdentifier identifier =
        new RaceEthnicityIdentifier(tenantId, localizationProperty);

    String race = "White";
    assertTrue(identifier.isOfThisType(race));

    // ignores case
    assertTrue(identifier.isOfThisType("white"));

    assertFalse(identifier.isOfThisType("automobile"));
    assertFalse(identifier.isOfThisType(""));
    assertFalse(identifier.isOfThisType(null));
  }
}
