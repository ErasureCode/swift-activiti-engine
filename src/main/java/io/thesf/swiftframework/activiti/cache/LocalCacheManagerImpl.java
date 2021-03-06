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
package io.thesf.swiftframework.activiti.cache;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Implement of {@link CacheManager}. Use {@link ConcurrentHashMap} as local cache.
 *
 * @author VirtualCry
 */
public class LocalCacheManagerImpl<K, V> extends ConcurrentHashMap<K, V> implements CacheManager<K, V> {
}
