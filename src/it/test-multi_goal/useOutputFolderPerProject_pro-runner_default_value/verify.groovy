/*
 * Copyright 2014 Thomas Bouffard (redfish4ktc)
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
 *
 */

import static org.fest.assertions.api.Assertions.*;

File baseOutputDirectory = new File(basedir, "target/soapui/ouput");
assertThat(new File(baseOutputDirectory, "simple-sucess-2-soapui-project")).describedAs("No subdirectory created in the configured outputFolder")
                                                                           .doesNotExist();
assertThat(new File(baseOutputDirectory, "TEST-TestSuite_1.xml")).describedAs("Junit test suite file has been generated in the configured outputFolder")
                                                                 .isFile();

return true;
