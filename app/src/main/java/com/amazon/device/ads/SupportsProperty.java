package com.amazon.device.ads;

/* compiled from: MraidProperty.java */
/* loaded from: classes.dex */
class SupportsProperty extends MraidDictionaryProperty {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SupportsProperty() {
        super("supports");
        try {
            this.data.put("tel", SDKUtilities.isTelSupported());
            this.data.put("sms", false);
            this.data.put("calendar", false);
            this.data.put("storePicture", false);
            this.data.put("inlineVideo", false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
