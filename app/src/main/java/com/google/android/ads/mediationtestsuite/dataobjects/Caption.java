package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.g;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;

/* loaded from: classes2.dex */
public class Caption {
    private final Component component;
    private final TestState testState;
    private final String version;

    /* loaded from: classes2.dex */
    public enum Component {
        SDK(g.f20888v0),
        ADAPTER(g.f20859h),
        MANIFEST(g.P),
        AD_LOAD(g.f20847b);
        
        private final int stringResId;

        Component(int i10) {
            this.stringResId = i10;
        }

        public int getStringResId() {
            return this.stringResId;
        }
    }

    public Caption(TestState testState, Component component) {
        this(testState, component, null);
    }

    public Component a() {
        return this.component;
    }

    public TestState b() {
        return this.testState;
    }

    public String c() {
        return this.version;
    }

    public Caption(TestState testState, Component component, String str) {
        this.testState = testState;
        this.component = component;
        this.version = str;
    }
}
