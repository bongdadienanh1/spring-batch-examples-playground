/**
 * Copyright 2011 Michael R. Lange <michael.r.lange@langmi.de>.
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
package de.langmi.spring.batch.examples.playground;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

/**
 * Simple ItemWriter just logs the item.
 *
 * @author Michael R. Lange <michael.r.lange@langmi.de>
 */
public class SimpleItemWriter implements ItemWriter<String> {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public void write(List<? extends String> items) throws Exception {
        LOG.debug("writing:");
        for (String item : items){
            LOG.debug(item);
        }
    }
    
}
