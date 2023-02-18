package com.bignerdranch.android.criminalintent;

import androidx.lifecycle.ViewModel;

public class CrimeListViewModel extends ViewModel{
    private boolean mShowSubtitle = false;

    public boolean isShowSubtitle() {
        return mShowSubtitle;
    }

    public void setShowSubtitle(boolean showSubtitle) {
        mShowSubtitle = showSubtitle;
    }
}
