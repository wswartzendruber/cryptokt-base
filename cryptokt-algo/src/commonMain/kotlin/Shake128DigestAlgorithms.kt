/*
 * Copyright 2021 William Swartzendruber
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package org.cryptokt.algo

/**
 * The SHAKE128 extendable output function.
 *
 * @constructor Initializes a new SHAKE128 instance according to the specified [digestSize].
 */
public class Shake128DigestAlgorithm(
    digestSize: Int,
) : KeccakDigestAlgorithm(32, digestSize, -97, 31, -128)
