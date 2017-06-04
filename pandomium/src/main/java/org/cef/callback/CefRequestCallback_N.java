// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.callback;

class CefRequestCallback_N extends CefNativeAdapter implements CefRequestCallback {

    CefRequestCallback_N() {
    }

    @Override
    public void Continue(boolean allow) {
        try {
            N_Continue(allow);
        } catch (UnsatisfiedLinkError ule) {
            ule.printStackTrace();
        }
    }

    @Override
    public void Cancel() {
        try {
            N_Cancel();
        } catch (UnsatisfiedLinkError ule) {
            ule.printStackTrace();
        }
    }

    private final native void N_Continue(boolean allow);

    private final native void N_Cancel();
}
