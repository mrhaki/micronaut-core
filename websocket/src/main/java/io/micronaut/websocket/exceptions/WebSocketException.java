/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.websocket.exceptions;

/**
 * General parent exception for all WebSocket related exceptions.
 *
 * @author graemerocher
 * @since 1.0
 */
public class WebSocketException extends RuntimeException {

    /**
     * @param message The message
     */
    public WebSocketException(String message) {
        super(message);
    }

    /**
     * @param message The message
     * @param cause The cause
     */
    public WebSocketException(String message, Throwable cause) {
        super(message, cause);
    }
}
