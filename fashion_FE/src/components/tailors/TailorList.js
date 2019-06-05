import React from 'react';
import Tailor from './Tailor';

const TailorList = (props) => {

    const tailor = props.tailors.map((tailor) => {
        return(
            <li key={tailor.id} className="tailors-component-list">
                <Tailor tailor={tailor}/>
            </li>
        )
    })

    return(
        <ul className="tailors-component">
            {tailor}
        </ul>
    )

}

export default TailorList;