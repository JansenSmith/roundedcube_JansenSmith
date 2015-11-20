double size =40;
//create a rounded cube
CSG roundedCube = new RoundedCube(	size,// X dimention
				size,// Y dimention
				size//  Z dimention
				)
				.cornerRadius(size/10)
				.toCSG()
return roundedCube