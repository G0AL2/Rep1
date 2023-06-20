package androidx.media;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3476a = aVar.p(audioAttributesImplBase.f3476a, 1);
        audioAttributesImplBase.f3477b = aVar.p(audioAttributesImplBase.f3477b, 2);
        audioAttributesImplBase.f3478c = aVar.p(audioAttributesImplBase.f3478c, 3);
        audioAttributesImplBase.f3479d = aVar.p(audioAttributesImplBase.f3479d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f3476a, 1);
        aVar.F(audioAttributesImplBase.f3477b, 2);
        aVar.F(audioAttributesImplBase.f3478c, 3);
        aVar.F(audioAttributesImplBase.f3479d, 4);
    }
}
