$(document).ready(function(){
	$('#nameInput').focus(function(){
		$('#nameWarn').fadeOut();
	});
	$('#exNumInput').focus(function(){
		$('#exNumWarn').fadeOut();
	});

	$('.submit_btn').click(function(){
		var name = $('#nameInput').val();
		var exNum = $('#exNumInput').val();
		if(!name||!exNum){
			if(name == '') {
				$('#nameWarn').fadeIn();
			} 
			if(exNum == ''){
				$('#exNumWarn').fadeIn();
			}
			return;
		}
		$.ajax({
			url:'/YiBan/formSubmit',
			type: 'POST',
			data: {
				name: name,
				exNum: exNum
			},
			success:function(resp){
				if(resp.code ==0) {
					//成功录取，拼接字符串
					var ch = $('.success_info').children('p');
					ch.eq(0).text('恭喜你，'+ resp.data.name + '，你已经被肇庆学院所录取!')
					ch.eq(1).text('你的专业是： '+resp.data.major +'('+resp.data.department+')');
					ch.eq(2).text('你的学号是： '+ resp.data.stu_id);
					// $('.success_info').append(html);
					$('.failue_info').slideUp();
					$('.success_info').slideDown();
				} else {
					//查询失败，未找到该学生的录取信息
					$('.failue_info').slideDown();
					$('.success_info').slideUp();
				}
			},
			error: function(){
				alert('提交失败， 请联系易班学生工作站');
			}
		});					
	});

});