$(document).ready(function(){
  $("button").click(function(){
    let selectedGender = $('input[name="gender"]:checked').val();
    alert("User Name:-"+ $("#uname").val()+"\nGender:-"+ selectedGender+"\nBranch:-"+$("#State").val()+"\nEmail Address:-"+$("#Email").val()+"\nPassword:-"+$("#Password").val()
    );
  });
});



