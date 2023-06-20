package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MraidUseCustomCloseCommand extends MraidCommand {
    static final String NAME = "useCustomClose";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getMraidName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.setUseCustomClose(jSONObject.getBoolean("state"));
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return NAME;
    }
}
