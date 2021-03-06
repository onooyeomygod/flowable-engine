/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.editor.language.xml;

import static org.junit.Assert.fail;

import org.flowable.bpmn.exceptions.XMLException;
import org.junit.Test;

public class EmptyModelTest extends AbstractConverterTest {

    @Test
    public void convertXMLToModel() throws Exception {
        try {
            readXMLFile();
            fail("Expected xml exception");
        } catch (XMLException e) {
            // exception expected
        }
    }

    @Test
    public void convertModelToXML() throws Exception {
        try {
            readXMLFile();
            fail("Expected xml exception");
        } catch (XMLException e) {
            // exception expected
        }
    }

    @Override
    protected String getResource() {
        return "empty.bpmn";
    }
}
