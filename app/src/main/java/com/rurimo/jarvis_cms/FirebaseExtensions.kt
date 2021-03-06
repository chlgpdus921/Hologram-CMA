/*
 * Designed and developed by 2020 rurimo
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

package com.rurimo.jarvis_cms

import com.google.firebase.database.DatabaseReference

fun DatabaseReference.ledTurnOn() {
  this.child("LED").setValue("On")
}

fun DatabaseReference.ledTurnOff() {
  this.child("LED").setValue("Off")
}

fun DatabaseReference.sendMessage(name: String, message: String) {
  this.child("Message").push().setValue(ControlMessage(name, message))
}
