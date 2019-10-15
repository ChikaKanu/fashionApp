import React, {Fragment, useState} from 'react';
import {genderCategories} from './../../constants/GenderConstant';
import {maleStyleCategories, femaleStyleCategories, girlStyleCategories, boyStyleCategories} from './../../constants/StyleConstants';

const StyleFormNew = (props) => {
    const [file, setFile] = useState('');
    const [genderCategory, setGenderCategory] = useState('')
    const [styleCategories, setStyleCategories] = useState([]);
    const [styleCategory, setStyleCategory] = useState(''); 
    
    const onSelectGender = e => {
        setGenderCategory(e.target.value)
        listStyleCategory(e.target.value);
    }

    const onSelectStyleCategory = e => {
        setStyleCategory(e.target.value)
    }

    const onChange = e =>{
        setFile(e.target.files[0])
    } 

    const handleSubmit=(event)=>{
        event.preventDefault()
        const newStyle = {
            "name": event.target.name.value,
            "image": file,
            "labourCost": event.target.labourCost.value,
            "source": event.target.source.value,
            "gender": genderCategory,
            "styleCategory": styleCategory,
            "selectedStyle": null
        }
        props.handleStylePost(newStyle);
    }

    const genderCat = genderCategories.map((x, y) => {
        return <option key={y} value={x}>{x}</option>
    })

    const listStyleCategory = (gender) => {
        (gender === "men")?
            setStyleCategories(maleStyleCategories) :
        (gender === "women")?
            setStyleCategories(femaleStyleCategories) :
        (gender === "boys")?
            setStyleCategories(boyStyleCategories) :
            setStyleCategories(girlStyleCategories)
    }

    const styleCat = styleCategories.map((x,y)=>{
        return<option key={y} value={x}>{x}</option>
    })


    return(
        <Fragment>
            <div>
                <form onSubmit= {handleSubmit}>
                    <div className="form-group">
                        <label htmlFor="name"><strong>Style Name</strong></label>
                        <input type="text" name="name" className="form-control" id="name" placeholder="Style Name"/>

                        <label htmlFor="labourCost"><strong>Cost</strong></label>
                        <input type="number" name= "labourCost" className="form-control" id="labourCost" placeholder="Style sowing cost"/>

                        <label htmlFor="source"><strong>Designer</strong></label>
                        <input type="text" name = "source" className="form-control" id="source" placeholder="Style Designer"/>

                        <label htmlFor="genderCategory"><strong>Gender Category</strong></label>
                        <select classname="custom-select custom-select-lg mb-3" name="gender" onChange={onSelectGender}>
                            <option disabled selected>Select Gender Category</option>
                        {genderCat}
                        </select>

                        <label htmlFor="selectedCategory"><strong> Style Category</strong></label>
                        <select classname="custom-select custom-select-sm" name="category" onChange={onSelectStyleCategory}>  
                        <option disabled selected>Select Style Category</option>
                        {styleCat}
                        </select>
                    </div>

                    <div className="form-group">
                        <label htmlFor="exampleFormControlFile1"><strong>Picture</strong></label>
                        <input type="file" 
                        className="form-control-file" 
                        id="exampleFormControlFile1" 
                        onChange = {onChange}
                        />
                    </div>
                    <button type="submit">Save</button>
                </form>
            </div>
        </Fragment>
    )



}

export default StyleFormNew;

// const listStyleCategory = (gender) => {
//     console.log(gender);
//     const styleCategory = [];
//     if(gender === "men"){
//         maleStyleCategories === styleCategory;
//         .map((x, y) => {
//             return <option key={y} value = {x}>{x}</option>
//         })
//     } if(gender === "women"){
//         femaleStyleCategories.map((x,y)=> {
//             return <option key={y} value={x}>{x}</option>
//         })
//     } if(gender === "boys"){
//         boyStyleCategories.map((x,y)=> {
//             return <option key={y} value={x}>{x}</option>
//         })
//     } else {
//         girlStyleCategories.map((x,y)=>{
//             return <option key={y} value={x}>{x}</option>
//         })
//     }
    