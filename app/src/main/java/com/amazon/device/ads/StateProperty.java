package com.amazon.device.ads;

/* compiled from: MraidProperty.java */
/* loaded from: classes.dex */
class StateProperty extends MraidStringProperty {
    MraidStateType stateType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StateProperty(MraidStateType mraidStateType) {
        super("state");
        this.stateType = mraidStateType;
    }

    @Override // com.amazon.device.ads.MraidStringProperty
    String getValue() {
        return this.stateType.toString();
    }
}
