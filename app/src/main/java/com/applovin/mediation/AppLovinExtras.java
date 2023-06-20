package com.applovin.mediation;

import android.os.Bundle;

/* loaded from: classes.dex */
public class AppLovinExtras {

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean mMuteAudio;

        public Bundle build() {
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("mute_audio", this.mMuteAudio);
            return bundle;
        }

        public Builder setMuteAudio(boolean z10) {
            this.mMuteAudio = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    static class Keys {
        static final String MUTE_AUDIO = "mute_audio";

        Keys() {
        }
    }
}
