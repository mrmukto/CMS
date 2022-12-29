package com.social.securityms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.shz.imagepicker.imagepicker.ImagePickerCallback;
import com.shz.imagepicker.imagepicker.model.PickedResult;

public class ComplainAddActivity extends AppCompatActivity implements ImagePickerCallback {
    private AppCompatImageView imageComplain,imgFrontCancel;
    private String imagePath_1 = "", image_click_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_add);
        initViews();
    }

    private void initViews() {
        imageComplain = findViewById(R.id.imgComplain);
        imageComplain.setOnClickListener(view -> {
            /*openCamera();*/
            image_click_value = "front";
        });
        imgFrontCancel.setOnClickListener(view -> {
            imageComplain.setImageDrawable(null);
            imageComplain.setBackgroundResource(R.drawable.image);
            imagePath_1 = null;
        });
    }

  /*  private void openCamera() {
        new ImagePicker.Builder(getActivity(), this)
                .useCamera(true)
                .build()
                .start();
    }*/


   /* @Override
    public void onImagesSelected(List<File> files) {

    }
*/
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    public void onImagePickerResult(@NonNull PickedResult pickedResult) {

    }
}