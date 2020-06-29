/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.brapi.v2.core.model.BrApiEnum;

/**
 * valid header fields
 */
public enum HeaderRowName implements BrApiEnum {
  OBSERVATIONTIMESTAMP("observationTimeStamp"),
  STUDYDBID("studyDbId"),
  STUDYNAME("studyName"),
  GERMPLASMDBID("germplasmDbId"),
  GERMPLASMNAME("germplasmName"),
  OBSERVATIONUNITDBID("observationUnitDbId"),
  OBSERVATIONUNITNAME("observationUnitName"),
  PLOTNUMBER("plotNumber"),
  PLANTNUMBER("plantNumber"),
  BLOCKNUMBER("blockNumber"),
  ENTRYNUMBER("entryNumber"),
  REPLICATE("replicate"),
  POSITIONCOORDINATEX("positionCoordinateX"),
  POSITIONCOORDINATEY("positionCoordinateY");

  private String value;

  HeaderRowName(String value) {
    this.value = value;
  }

  @Override
  public String getBrapiValue() {
    return value;
  }
}
