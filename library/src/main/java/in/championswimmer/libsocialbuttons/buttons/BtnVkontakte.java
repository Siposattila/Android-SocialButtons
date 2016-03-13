package in.championswimmer.libsocialbuttons.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.Button;

import in.championswimmer.libsocialbuttons.R;

/**
 * Created by magomed on 17/12/15.
 */
public class BtnVkontakte extends AppCompatButton {
    public BtnVkontakte(Context context, AttributeSet attrs) {
        super(context, attrs);

        int colorNormal = getResources().getColor(R.color.vkontakte);
        Drawable logo = getResources().getDrawable(R.drawable.logo_vkontakte);

        setCompoundDrawablesWithIntrinsicBounds(logo, null, null, null);
        setSupportBackgroundTintList(ColorStateList.valueOf(colorNormal));
        setIncludeFontPadding(true);

        if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "textAllCaps") == null) {
            setSupportAllCaps(false);
        }
        if ((attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "fontFamily") == null) &&
                (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "textStyle") == null)) {
            setTypeface(Typeface.create("sans-serif-light", Typeface.NORMAL));
        }

        if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "textSize") == null) {
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        }

        if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "padding") == null) {
            int padding = getResources().getDimensionPixelSize(R.dimen.social_button_padding);
            setPadding(padding, padding, padding, padding);
        }

        if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "drawablePadding") == null) {
            int padding = getResources().getDimensionPixelSize(R.dimen.social_button_padding);
            setCompoundDrawablePadding(padding);
        }

        setTextColor(Color.WHITE);
    }
}
