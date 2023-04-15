//create a rounded cube
CSG roundedCube = new RoundedCube(	40,// X dimention
				4,// Y dimention
				40//  Z dimention
				)
				.cornerRadius(8)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
return roundedCube