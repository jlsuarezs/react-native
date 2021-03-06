/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;

/**
 * This interface should be implemented be native {@link View} subclasses that can represent more
 * than a single react node (e.g. TextView). It is use by touch event emitter for determining the
 * react tag of the inner-view element that was touched.
 */
public interface ReactCompoundView {

  /**
   * Return react tag for touched element. Event coordinates are relative to the view
   * @param touchX the X touch coordinate relative to the view
   * @param touchY the Y touch coordinate relative to the view
   */
  int reactTagForTouch(float touchX, float touchY);
}
